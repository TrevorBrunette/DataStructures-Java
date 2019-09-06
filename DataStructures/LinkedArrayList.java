public class LinkedArrayList<E>{

    private ONode<E> first;

    public LinkedArrayList(ONode<E> a){
        first = a;
    }

    public LinkedArrayList(E a){
        first = new ONode<E>(a);
    }

    public int size(){
        if(first == null) {
            return 0;
        }else{
            return count(first);
        }
    }

    public boolean isEmpty(){
        return first == null;
    }

    private int count(ONode<E> a){
        int count = 1;
        while(a.hasNext()){
            a = a.getNext();
            count++;
        }
        return count;
    }

    public void add(E a){
        ONode<E> temp = first;
        while(temp.hasNext()){
            temp = temp.getNext();
        }
        temp.setNext(a);
    }

    public E get(int index){
        int count = 0;
        ONode<E> temp = first;
        while(temp.hasNext() && count < index){
            temp = temp.getNext();
            count++;
        }
        return temp.getData();

    }

    public ONode<E> getNode(int index){
        int count = 0;
        ONode<E> temp = first;
        while(temp.hasNext() && count < index){
            temp = temp.getNext();
            count++;
        }
        return temp;
    }


    public void remove(int index){
        if(isEmpty() || index >= size()){
            return;
        }
        if(size() == 1){
            first = null;
            return;
        }
        ONode<E> temp = first;
        if(!getNode(index).hasNext()){
            getNode(index-1).delNext();
            return;
        }
        int count = 0;
        while(temp.hasNext() && count < index){
            temp = temp.getNext();
            count++;
        }
        temp.set(temp.getNext().getData(), temp.getNext().getNext());
    }

    @Override
    public String toString() {
        String out = "";
        for(int i = 0; i < size(); i++){
            out += get(i) + " ";
        }
        return out;
    }

}