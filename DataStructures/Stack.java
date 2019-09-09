public class Stack {

    private Node head;

    public Stack(){
        head = null;
    }

    public Stack(int i){
        head = new Node(i);
    }

    public Stack(Node a){
        head = a;
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

    public int peek()throws NullPointerException{
        try{
            return head.getData();
        } catch(NullPointerException e){
            e.printStackTrace();
        }
        return 0;
    }

    public int pop() throws NullPointerException{
        int temp = head.getData();
        if(head.hasNext()) {
            head = head.getNext();
        } else {
            throw new NullPointerException();
        }
        return temp;

    }

    public void push(Node a){
        a.setNext(head);
        head = a;
    }

    public void push(int i){
        push(new Node(i));
    }

    @Override
    public String toString() {
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
