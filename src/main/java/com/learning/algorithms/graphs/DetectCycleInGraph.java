package com.learning.algorithms.graphs;

import java.util.LinkedList;

public class DetectCycleInGraph extends Graph{


    public DetectCycleInGraph(int verties) {
        super(verties);
    }

    public boolean detectCycle(int source, boolean visited[]){

        boolean flag = false;

        if(visited[source]){
            return true;
        }
        visited[source] = true;

        LinkedList<Integer> connectedNodes = adjList.get(source);

        for(int i : connectedNodes) {
            if (visited[i]) {
                return true;
            } else {
                flag = detectCycle(i, visited);
            }
        }
        return flag;
    }

    public int findMotherVertex(Graph graph){

        int last = -1;

        boolean visited[] = new boolean[graph.verties];

        for(int i=0; i < verties; i++){
            if(!visited[i]){
                dfs(i, visited);
                last = i;
            }
        }

        boolean check[] = new boolean[graph.verties];

        dfs(last, check);

        for(boolean b : check){
            if(!b){
                return -1;
            }
        }
        return last;
    }

    public void dfs(int source, boolean visited[]){

        visited[source] = true;

        for(int i : adjList.get(source)){
            if(!visited[i]){
                dfs(i, visited);
            }
        }
    }

    public int findAllEdges(Graph graph){

        int sum = 0;

        for(int i = 0; i < graph.verties; i++){
            sum = sum + adjList.get(i).size();
        }

        return sum/2;
    }

    public static void main(String[] args) {
        DetectCycleInGraph p = new DetectCycleInGraph(4);

        p.addEdge(0, 1);
        p.addEdge(0, 2);
        p.addEdge(1, 2);
        p.addEdge(2, 3);
        p.addEdge(3, 0);

        p.printGraph(p);
        for(int i = 0; i< p.verties; i++){
            boolean visited[] = new boolean[p.verties];
            System.out.println(p.detectCycle(i, visited));
        }

        System.out.println(p.findMotherVertex(p));
        System.out.println(p.findAllEdges(p));
    }
}
