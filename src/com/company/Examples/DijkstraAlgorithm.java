package com.company.Examples;

import com.company.Data.Edge;
import com.company.Data.Graph;
import com.company.Data.MInQueue;
import com.company.Data.Vertex;

import java.util.ArrayList;

/**
 * @author nuran
 * @version 1.0.
 * @since 8/1/15
 */
public class DijkstraAlgorithm {
    Integer infinity = 10000;
    Graph graph;
    Vertex source;

    ArrayList<Vertex> settledNodes = null;
    ArrayList<Vertex> unsettledNodes = null;

    MInQueue mInQueue;

    public DijkstraAlgorithm(Graph graph, Vertex source){
        this.graph = graph;
        this.source = source;

        this.mInQueue = new MInQueue();
    }

    public Graph compute(){
        Vertex u=null;

        initializeSingleSource();
        settledNodes = null;
        unsettledNodes = graph.getVertexes();
        for(Vertex v:unsettledNodes){
            mInQueue.addItem(v);
        }
        while (unsettledNodes.size()>0){
            u = mInQueue.extract(); //extraction from min queue
            settledNodes.add(u);
            for(Vertex v:u.getAdjacent()){
                for(Edge w:getEdges(u,v))
                    relax(u,v,w);
            }
        }

        return this.graph;
    }

    public void initializeSingleSource(){
        for(Vertex v:graph.getVertexes()){
            v.setDistance(infinity);
            v.setPredecessor(null);
        }
        source.setDistance(0);
    }

    public  void relax(Vertex u, Vertex v, Edge w){
        if(v.getDistance()>(u.getDistance()+w.getWeight())){
            v.setDistance(u.getDistance() + w.getWeight());
            v.setPredecessor(u);
        }
    }

    public ArrayList<Edge> getEdges(Vertex u,Vertex v){
        ArrayList<Edge> result= new ArrayList<Edge>();
        for(Edge e:graph.getEdges()){
            if(e.getSource().equals(u) & e.getDestination().equals(v))
                result.add(e);
            else if (e.getSource().equals(v) & e.getDestination().equals(u))
                result.add(e);
        }

        return result;
    }

    public MInQueue getmInQueue() {
        return mInQueue;
    }

    public void setmInQueue(MInQueue mInQueue) {
        this.mInQueue = mInQueue;
    }
}
