package com.learning.algorithms.graphs;

import java.util.LinkedList;
import java.util.Stack;

public class DFS extends Graph {
    public DFS(int verties) {
        super(verties);
    }

    public void dfsTraversal(int source){

        boolean visited[] = new boolean[verties];

        visited[source] = true;

        Stack<Integer> stack = new Stack<>();

        stack.push(source);

        while(!stack.isEmpty()){

           int s = stack.pop();

            System.out.print(s + " ");

            LinkedList<Integer> connectedNode = adjList.get(s);

            connectedNode.stream().forEach( i -> {
                if(!visited[(int)i]){
                    visited[(int)i] = true;
                    stack.push((int)i);
                }
            });
        }
    }

    public static void main(String[] args) {
        DFS p = new DFS(4);

        p.addEdge(0, 1);
        p.addEdge(0, 2);
        p.addEdge(1, 2);
        p.addEdge(2, 3);
        p.addEdge(3, 0);

        p.printGraph(p);
        p.dfsTraversal(2);
    }
}
