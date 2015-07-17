package com.company.DataStructure;

import java.util.ArrayList;

/**
 * @author nuran
 * @version 1.0.
 * @since 7/13/15
 */
public class Node<T> {

    ArrayList<Node<T>> edges;

    T value;
    Integer level;
    boolean visited;
    String name;


    public void setEdges(Node<T> child) {
        getEdges().add(child);
    }

    public ArrayList<Node<T>> getEdges() {
        if(edges == null)
            edges = new ArrayList<Node<T>>();

        return edges;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
