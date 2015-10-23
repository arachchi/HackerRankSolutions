package com.company.Data;

import java.util.ArrayList;

/**
 * @author nuran
 * @version 1.0.
 * @since 8/1/15
 */
public class Vertex {
    final private String id;
    final private String name;
    
    Integer distance;
    Vertex predecessor;
    ArrayList<Vertex> adjacent;

    public Vertex(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    public ArrayList<Vertex> getAdjacent() {
        if(adjacent == null)
            adjacent = new ArrayList<Vertex>();
        return adjacent;
    }

    public void setAdjacent(ArrayList<Vertex> adjacent) {
        this.adjacent = adjacent;
    }
    public void setAdjacentVertex(Vertex vertex){
        getAdjacent().add(vertex);
    }

    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vertex other = (Vertex) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
