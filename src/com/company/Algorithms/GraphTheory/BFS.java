package com.company.Algorithms.GraphTheory;


import com.company.DataStructure.Node;
import sun.misc.Queue;

import java.util.ArrayList;
import java.util.Scanner;


public class BFS {

    static Node<Integer> root;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer T = scanner.nextInt();

        for(long i=0;i<T;i++){

            int N   = scanner.nextInt();
            int M   = scanner.nextInt();

            Node<Integer>[] list = new Node[N];
            for(int k=0;k<N;k++){
                list[k] = new Node<Integer>();
                list[k].setValue(0);
                list[k].setLevel(-1);
                list[k].setName(" Node " + (k+1));
            }

            for (int k=0;k<M;k++){
                int x  = scanner.nextInt();
                int y   = scanner.nextInt();

                setRelation(list[x-1],list[y-1]);
            }

            int rootVal = scanner.nextInt();

            root = list[rootVal-1];

            try {
                breathFirst();
            }catch (Exception e){
                System.out.println();
            }

            for(int k=0;k<N;k++){
                if(k != rootVal-1) {
                    if (list[k].getValue() == 0)
                        System.out.printf("%d ", -1);
                    else
                        System.out.printf("%d ", list[k].getValue().intValue());
                }
            }
            System.out.printf("\n");

        }
    }
    public static void breathFirst() throws InterruptedException {
        Node<Integer> p = root;
        Queue<Node<Integer>> queue = new Queue<Node<Integer>>();

        if(p != null){
            queue.enqueue(p);
            while (!queue.isEmpty()){
                p = queue.dequeue();

                visit(p);
                for(Node<Integer> i:p.getEdges()){
                    if(!i.isVisited())
                        queue.enqueue(i);
                }

            }
        }

    }

    public static void visit(Node<Integer> node){
        node.setVisited(true);
        if(node.getLevel() == -1){
            node.setLevel(1);
            node.setValue(0);
        }

        for(Node<Integer> i:node.getEdges()){
            if( ( (node.getLevel() +1) < (i.getLevel()) )  || (i.getLevel() < 0) ) {
                i.setLevel(node.getLevel() + 1);
                i.setValue(node.getValue() + 6);
            }
        }


    }

    public static void setRelation(Node<Integer> vertex1,Node<Integer> vertex2 ){

        vertex1.setEdges(vertex2);
        vertex2.setEdges(vertex1);
    }




}
