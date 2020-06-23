package com.machi.daily.math.listnode;

public class MyListNode<T> {
    private class Node{
        private T t;
        private Node next;
        Node(T t){
            this.t = t;
            next = null;
        }
    }
}
