package com.test.pluto.algorithm;

import com.test.pluto.entity.Vertex;

import java.util.*;

/**
 * Created by captain on 2017/10/2.
 */
public class AStarAlgorithm implements Algorithm {


    public void createGraph(Vertex startVertex, Vertex endVertex) {

        if(null != startVertex && null != endVertex) {
            AStarAlgorithm(startVertex, endVertex);
        }

    };


    public void AStarAlgorithm(Vertex startVertex, Vertex endVertex) {

//        Set<Vertex> explored = new HashSet<Vertex>();
//
//        PriorityQueue<Vertex> queue = new PriorityQueue<Vertex>(20,
//                new Comparator<Vertex>(){
//                    //override compare method
//                    public int compare(Vertex i, Vertex j){
//                        if(i.f_scores > j.f_scores){
//                            return 1;
//                        }
//
//                        else if (i.f_scores < j.f_scores){
//                            return -1;
//                        }
//
//                        else{
//                            return 0;
//                        }
//
//                        return 0;
//                    }
//
//                }
//        );
//
//        //cost from start
//        source.g_scores = 0;
//
//        queue.add(source);
//
//        boolean found = false;
//
//        while((!queue.isEmpty())&&(!found)){
//
//            //the node in having the lowest f_score value
//            Node current = queue.poll();
//
//            explored.add(current);
//
//            //goal found
//            if(current.value.equals(goal.value)){
//                found = true;
//            }
//
//            //check every child of current node
//            for(Edge e : current.adjacencies){
//                Node child = e.target;
//                double cost = e.cost;
//                double temp_g_scores = current.g_scores + cost;
//                double temp_f_scores = temp_g_scores + child.h_scores;
//
//
//                /*if child node has been evaluated and
//                the newer f_score is higher, skip*/
//
//                if((explored.contains(child)) &&
//                        (temp_f_scores >= child.f_scores)){
//                    continue;
//                }
//
//                /*else if child node is not in queue or
//                newer f_score is lower*/
//
//                else if((!queue.contains(child)) ||
//                        (temp_f_scores < child.f_scores)){
//
//                    child.parent = current;
//                    child.g_scores = temp_g_scores;
//                    child.f_scores = temp_f_scores;
//
//                    if(queue.contains(child)){
//                        queue.remove(child);
//                    }
//
//                    queue.add(child);
//
//                }
//
//            }
//
//        }

    }


    public List<Vertex> getShortestPathTo(Vertex endVertex) {

        return new ArrayList<>();

    };


}
