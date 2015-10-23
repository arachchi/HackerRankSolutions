package com.company.Algorithms.GraphTheory;

import com.company.Data.Edge;
import com.company.Data.Graph;
import com.company.Data.Vertex;
import com.company.Examples.DijkstraAlgorithm;

import java.util.*;

/**
 * @author nuran
 * @version 1.0.
 * @since 7/18/15
 */
public class Dijkstra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer T = scanner.nextInt();

        Vertex root;

        for(long i=0;i<T;i++) {

            int N = scanner.nextInt();
            int M = scanner.nextInt();

            ArrayList<Vertex> vertices = new ArrayList<Vertex>();
            ArrayList<Edge> edges = new ArrayList<Edge>();
            Graph graph = new Graph(vertices,edges);

            for (int k = 0; k < N; k++) {
                vertices.add(new Vertex(""+k,""+k));
            }

            for (int k = 0; k < M; k++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                int r = scanner.nextInt();

                edges.add(new Edge(""+k,vertices.get(x-1),vertices.get(y-1),r));
            }

            int rootVal = scanner.nextInt();

            root = vertices.get(rootVal - 1);

            DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm(graph,root);
            dijkstraAlgorithm.compute();
        }
    }

    public static void dijkstra(){


    }
}