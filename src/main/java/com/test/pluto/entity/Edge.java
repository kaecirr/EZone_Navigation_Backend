package com.test.pluto.entity;

/**
 * Contains the information Edge
 *
 * @author captain
 */

public class Edge {

    // Linked vertex
    public Vertex target;

    // Weight to linked vertex
    public double weight;

    public Edge(Vertex target, double weight) {
        this.target = target;
        this.weight = weight;
    }


    public Vertex getTarget() {
        return target;
    }

    public double getWeight() {
        return weight;
    }
}
