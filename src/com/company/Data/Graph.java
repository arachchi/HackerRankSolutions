package com.company.Data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author nuran
 * @version 1.0.
 * @since 8/1/15
 */
public class Graph {
    private final ArrayList<Vertex> vertexes;
    private final ArrayList<Edge> edges;

    public Graph(ArrayList<Vertex> vertexes, ArrayList<Edge> edges) {
        this.vertexes = vertexes;
        this.edges = edges;
    }

    public ArrayList<Vertex> getVertexes() {
        return vertexes;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }
}
