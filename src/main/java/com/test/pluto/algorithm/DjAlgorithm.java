package com.test.pluto.algorithm;

import com.test.pluto.entity.Edge;
import com.test.pluto.entity.Vertex;

import java.util.*;


/**
 * Description: DjAlgorithm , get the shortest path
 *
 * @author Yuntian & Lei Wang
 */
public class DjAlgorithm implements Algorithm {

    /**
     * Create graph topology
     *
     * @param startVertex
     */
    @Override
    public void createGraph(Vertex startVertex, Vertex endVertex) {

        if(null != startVertex && null != endVertex) {
            DjAlgorithm(startVertex);
        }
    }

    /**
     * Get the shortest path to targetVertex
     *
     * @param target
     * @return
     */
    @Override
    public List<Vertex> getShortestPathTo(Vertex target) {
        List<Vertex> path = new ArrayList<Vertex>();
        for (Vertex vertex = target; vertex != null; vertex = vertex.previous) {
            System.out.println("!!!!!!!!! vertex.previous=" + vertex.previous);
            path.add(vertex);
        }

        Collections.reverse(path);
        return path;

    }

    /**
     * Create graph topology using Dj algorithm
     *
     * @param startVertex
     */
    public void DjAlgorithm(Vertex startVertex) {

        startVertex.minDistance = 0.;

        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
        vertexQueue.add(startVertex);

        while (!vertexQueue.isEmpty()) {

            //Get the first element in the vertexQueue
            Vertex currentVertex = vertexQueue.poll();

            //System.out.println("ˆˆˆˆˆˆˆˆˆˆˆˆˆˆˆˆˆ currentVertex =" + currentVertex.getLocationId());

            // Visit each edge of currentVertex
            for (Edge e : currentVertex.adjacency) {
                //System.out.println("************* currentVertex.adjacency.length =" + currentVertex.adjacency.length);

                if(null != e && null != e.target) {
                    Vertex v = e.target;
                    //System.out.println("************* e.target =" + v.getLocationId());
                    double weight = e.weight;
                    double distanceThroughU = currentVertex.minDistance + weight;
                    if (distanceThroughU < v.minDistance) {
                        vertexQueue.remove(v);
                        v.minDistance = distanceThroughU ;
                        v.previous = currentVertex;
                        vertexQueue.add(v);
                    }
                }
            }
        }
    }

}