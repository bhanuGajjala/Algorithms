package com.learning.algorithms.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Graph {

    int verties;
    List<LinkedList<Integer>> adjList;
    // LinkedList<Integer> adj[];

    public Graph(int verties){
        this.verties = verties;
        adjList = new ArrayList<>();
        //adj = new LinkedList[verties];
        for(int i=0; i < verties; i++){
            adjList.add(new LinkedList<>());
            //adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int source, int vertex){
        adjList.get(source).add(vertex);
        adjList.get(vertex).add(source);
    }

    public void printGraph(Graph g){
        AtomicInteger count = new AtomicInteger();
        adjList.stream().forEach(i ->{

            System.out.println(count.getAndIncrement() + "->" + i);
//            i.stream().forEach(j ->{
//                System.out.print(" -> "+ j);
//            });
        });

    }
}
