public class Stack {

    private Node head;

    public Stack(Node a){
        head = a;
    }

    public boolean isEmpty(){
        return head == null;
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
        try {
            int temp = head.getData();
            head = head.getNext();
            return temp;
        } catch (NullPointerException e){
            e.printStackTrace();
        }
        return 0;
    }

    public void push(Node a){
        a.setNext(head);
        head = a;
    }

}
