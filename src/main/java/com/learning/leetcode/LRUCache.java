package com.learning.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private Map<Integer, DoubleLinkedNode> cache = new HashMap<>();
    private int size;
    private int capacity;
    private DoubleLinkedNode head, tail;


    public LRUCache(int capacity){
        this.capacity = capacity;
        this.size = 0;

        head = new DoubleLinkedNode();
        tail = new DoubleLinkedNode();
        head.next = tail;
        tail.prev = head.next;
    }


    public int get(int key) {

        DoubleLinkedNode node = cache.get(key);

        if(node == null){
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {

        DoubleLinkedNode node = cache.get(key);

        if(node == null){
            DoubleLinkedNode newNode = new DoubleLinkedNode();
            newNode.key = key;
            newNode.value = value;

            cache.put(key, newNode);
            addNode(node);
            ++size;
            if(size > capacity){
                DoubleLinkedNode tail = popTail();
                removeNode(tail);
                --size;
            }

        }else{
            node.value = value;
            moveToHead(node);
        }
    }



    class DoubleLinkedNode{

        int key;
        int value;
        DoubleLinkedNode next;
        DoubleLinkedNode prev;
    }

    private void addNode(DoubleLinkedNode node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(DoubleLinkedNode node){

        DoubleLinkedNode prev = node.prev;
        DoubleLinkedNode next = node.next;

        prev.next = next;
        next.prev = prev;

    }

    private void moveToHead(DoubleLinkedNode node){

        removeNode(node);
        addNode(node);

    }

    private DoubleLinkedNode popTail(){

        DoubleLinkedNode res = tail.prev;
        removeNode(res);
        return res;
    }
}
