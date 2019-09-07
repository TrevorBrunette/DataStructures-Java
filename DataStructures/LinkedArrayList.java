import com.sun.jdi.ArrayReference;

public class LinkedArrayList<E>{

    private ONode<E> first;
    private int size;

    public LinkedArrayList(){
        first = null;
        size = 0;
    }

    public LinkedArrayList(E a){
        first = new ONode<E>(a);
        size = 1;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void add(E a){
        if(isEmpty()){
            first = new ONode<E>(a);
            size++;
            return;
        }
        ONode<E> temp = first;
        while(temp.hasNext()){
            temp = temp.getNext();
        }
        temp.setNext(a);
        size++;
    }

    public E get(int index) throws IndexOutOfBoundsException{
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        int count = 0;
        ONode<E> temp = first;
        while(temp.hasNext() && count < index){
            temp = temp.getNext();
            count++;
        }
        return temp.getData();

    }

    public ONode<E> getNode(int index) throws IndexOutOfBoundsException{
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        int count = 0;
        ONode<E> temp = first;
        while(temp.hasNext() && count < index){
            temp = temp.getNext();
            count++;
        }
        return temp;
    }

    public void set(int index, E a){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        if(!isEmpty()) {
            if (index == 0) {
                if(size == 1) {
                    first = new ONode<>(a);;
                } else {
                    first.setData(a);
                }
            } else {
                ONode<E> temp = getNode(index-1);
                ONode<E> newNode = new ONode<>(a);
                if(!getNode(index).hasNext()){
                    getNode(index-1).setNext(newNode);
                    return;
                }
                newNode.setNext(temp.getNext().getNext());
                temp.setNext(newNode);
            }
        }
    }


    public void remove(int index) throws IndexOutOfBoundsException{
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        if(isEmpty()){
            return;
        }
        if(size == 1 && index == 0){
            first = null;
            size--;
            return;
        }
        ONode<E> temp = first;
        if(!getNode(index).hasNext()){
            getNode(index-1).delNext();
            size--;
            return;
        }
        for(int i = 0; i< index; i++){
            temp = temp.getNext();
        }
        temp.set(temp.getNext().getData(), temp.getNext().getNext());
        size--;
    }

    @Override
    public String toString() {
        if(isEmpty()){
            return "";
        }
        String out = "";
        for(int i = 0; i < size-1; i++){
            out += get(i) + ", ";
        }
        out += get(size-1);
        return out;
    }

}