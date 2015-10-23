package com.company.Data;

/**
 * @author nuran
 * @version 1.0.
 * @since 8/1/15
 */
public class MInQueue {
    Node head;
    Node tail;

    public Node getHead() {
        if(head == null)
            this.head = new Node();
        return head;
    }

    public Node getHead(Vertex vertex){
        if(head == null) {
            Node temp = getHead();
            temp.setV(vertex);
        }return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        if(tail == null)
            this.tail = this.head;

        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void initialize(Vertex vertex){

        getHead().setV(vertex);
        getHead().setPrev(null);

        setTail(getHead());
    }
    public void addItem(Vertex vertex){
        Node iterator= getHead(vertex);
        while (iterator !=null){
            if(iterator.getV().getDistance() > vertex.getDistance()){
                Node temp = new Node();
                temp.setV(vertex);
                temp.setPrev(iterator.getPrev());
                temp.setNext(iterator);

                iterator.setPrev(temp);

                iterator = null;
            }else {
                iterator = iterator.getNext();
            }
        }
    }
    public Vertex extract(){
        Node temp= getHead();
        setHead(getHead().getNext());

        return temp.getV();
    }

    class Node{
        Node next = null;
        Node prev = null;
        Vertex v;

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Vertex getV() {
            return v;
        }

        public void setV(Vertex v) {
            this.v = v;
        }
    }
}
