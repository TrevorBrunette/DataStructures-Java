package com.trevor.Contests.DataStructures;

public class Node {

    private int data;
    private Node next;

    public Node(int data){
        this.data = data;
    }

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public boolean hasNext(){
        return next != null;
    }

    @Override
    public Node clone(){
        return new Node(data, next.clone());
    }
}
