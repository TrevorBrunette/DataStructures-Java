package Structures;

public class ONode<T> {

    private T data;
    private ONode<T> next;

    public ONode(T data){
        this.data = data;
    }

    public ONode(T data, ONode<T> next){
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public ONode<T> getNext() {
        return next;
    }

    public void set(T data, ONode<T> next){
        this.data = data;
        this.next = next;
    }

    public void delNext(){
        next = null;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(ONode next) {
        this.next = next;
    }

    public void setNext(T next){
        this.next = new ONode<>(next);
    }

    public boolean hasNext(){
        return next != null;
    }

    @Override
    public ONode<T> clone(){
        if(hasNext()) {
            return new ONode<T>(data, next.clone());
        }
        else{
            return new ONode<T>(data, null);
        }
    }

    @Override
    public String toString() {
        return data.toString();
    }
}