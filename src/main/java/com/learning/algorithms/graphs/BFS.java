package com.learning.algorithms.graphs;

import java.util.LinkedList;

public class BFS extends Graph {


    public BFS(int verties) {
        super(verties);
    }

    public void BFSTraversal(int source) {

        boolean visited[] = new boolean[verties];

        LinkedList<Integer> queue = new LinkedList<>();

        queue.add(source);
        visited[source] = true;

        while (!queue.isEmpty()) {
            int s = queue.poll();
            System.out.print(s + " ");

            LinkedList connectedNodes = adjList.get(s);

            connectedNodes.stream().forEach(i -> {
                if (!visited[(int) i]) {
                    visited[(int) i] = true;
                    queue.add((int) i);
                }
            });

        }
    }

    public static void main(String[] args) {
        BFS p = new BFS(4);

        p.addEdge(0, 1);
        p.addEdge(0, 2);
        p.addEdge(1, 2);
        p.addEdge(2, 3);
        p.addEdge(3, 0);

        p.printGraph(p);
        p.BFSTraversal(2);
    }
}
