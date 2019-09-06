package com.trevor.Contests.DataStructures;

public class Queue {

    private Node head;
    private Node tail;

    public Queue(Node a){
        head = tail = a;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int peek() throws NullPointerException{
        try{
            return head.getData();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int pop() throws NullPointerException{
        int temp = head.getData();
        head = head.getNext();
        try{
            return temp;
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void push(Node a){
        if(tail != null) {
            tail.setNext(a);
            tail = a;
        }
        else{
            head = tail = a;
        }

    }

}
