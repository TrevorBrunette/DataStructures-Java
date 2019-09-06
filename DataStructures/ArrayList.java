package com.trevor.Contests.DataStructures;

import java.util.Arrays;

public class ArrayList<E> {

    private Object[] list;
    private int size;

    public ArrayList(){
        this.list = new Object[5];
        size = 0;
    }

    public ArrayList(E[] list){
        this.list = list;
        size = list.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    private void grow(int newSize){
        int temp = size;
        if(newSize <= temp){
            temp = temp + newSize;
        }
        list = Arrays.copyOf(list, temp);
    }

    private void grow(){
        grow(1);
    }

    public void add(E a){
        if(size >= list.length){
            grow();
        }
        list[size] = a;
        size++;
    }

    public void set (int index, E a){
        Object[] tempList = new Object[size - index];
        System.arraycopy(list, index, tempList, 0, size - index);
    }

    @SuppressWarnings("unchecked")
    private E getS(int index){
        return (E)list[index];
    }

    public E get(int index){
        if(index < 0 || index > size - 1){
            throw new IndexOutOfBoundsException();
        }
        return getS(index);
    }

    @SuppressWarnings("unchecked")
    public E[] toArray(){
        return (E[])Arrays.copyOf(list, list.length);
    }

}
