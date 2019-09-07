public class Queue {

    private Node head;
    private Node tail;

    public Queue(){
        head = tail = null;
    }

    public Queue(int i){
        head = (tail = new Node(i));
    }

    public Queue(Node a){
        head = (tail = a);
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int size(){
        if(head==null){
            return 0;
        }
        int count = 1;
        Node temp = head;
        while(temp.hasNext()){
            temp = temp.getNext();
            count++;
        }
        return count;
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
            head = (tail = a);
        }
    }

    public void push(int i){
        push(new Node(i));
    }

    @Override
    public String toString() throws NullPointerException{
        if(isEmpty()){
            return "";
        }
        if(!head.hasNext()){
            return head.toString();
        }
        String out = "";
        Node temp = head;
        for(int i = 0; i < size()-1; i++){
            out += temp + ", ";
            temp = temp.getNext();
        }
        out += temp;
        return out;
    }

}
