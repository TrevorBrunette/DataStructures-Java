package Structures;

import java.util.Arrays;

public class ArrayList<E> {

    private Object[] list;
    private int size;

    public ArrayList(){
        this.list = new Object[4];
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

    private void grow(){
        Object[] newList = new Object[2 * list.length];
        for(int i = 0; i < list.length; i++){
            newList[i] = list[i];
        }
        list = newList;
    }

    public void add(E a){
        if(size >= list.length){
            grow();
        }
        list[size] = a;
        size++;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) throws IndexOutOfBoundsException{
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        return (E)list[index];
    }

    public void set (int index, E a) throws IndexOutOfBoundsException{
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        Object[] tempList = new Object[list.length];
        for(int i = 0; i < index; i++){
            tempList[i] = list[i];
        }
        tempList[index] = a;
        for(int i = index+1; i < size; i++){
            tempList[i] = list[i];
        }
        list = tempList;
    }

    public void remove(int index) throws IndexOutOfBoundsException{
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        Object[] tempList = new Object[list.length];
        if(index!=0) {
            for (int i = 0; i < index; i++) {
                tempList[i] = list[i];
            }

            for (int i = index + 1; i < size; i++) {
                tempList[i] = list[i];
            }
        }
        else{
            for (int i = 1; i < size; i++) {
                tempList[i-1] = list[i];
            }
        }
        list = tempList;
        size--;
    }

    @SuppressWarnings("unchecked")
    public E[] toArray(){
        return (E[])Arrays.copyOf(list, list.length);
    }

    @Override
    public String toString(){
        if(isEmpty()){
            return "";
        }
        String out = "";
        for(int i = 0; i < size-1; i++){
            out += get(i) + ", ";
        }
        out += get(size - 1);
        return out;
    }

}
