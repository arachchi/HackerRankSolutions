package com.company.DataStructure;

/**
 * @author nuran
 * @version 1.0.
 * @since 7/18/15
 */
public class Edge<T> {
    Node<T> source;
    Node<T> destination;

    T value;
    boolean visited;
    String name;

    public Edge(Node<T> source,Node<T> destination){
        this.source = source;
        this.destination = destination;
    }

    public Edge(Node<T> source,Node<T> destination, T value){
        this.source = source;
        this.destination = destination;
        this.value = value;
    }

    public Node<T> getSource() {
        return source;
    }

    public void setSource(Node<T> source) {
        this.source = source;
    }

    public Node<T> getDestination() {
        return destination;
    }

    public void setDestination(Node<T> destination) {
        this.destination = destination;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
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
