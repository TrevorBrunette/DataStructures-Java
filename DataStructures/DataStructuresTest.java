import Structures.ArrayList;
import Structures.LinkedArrayList;
import Structures.Queue;
import Structures.Stack;

public class DataStructuresTest {

    public static void main(String[] args) throws Exception{
        System.out.println("Structures.Stack Class:");
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        System.out.println("Pop!");
        System.out.println(s.pop());
        System.out.println(s + "\n");

        System.out.println("Structures.Queue Class:");
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q);
        System.out.println("Pop!");
        System.out.println(q.pop());
        System.out.println(q + "\n");

        System.out.println("Structures.ArrayList Class:");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList);
        System.out.println("Set!");
        arrayList.set(0, 0);
        arrayList.set(4, 6);
        System.out.println(arrayList);
        System.out.println("Remove!");
        arrayList.remove(0);
        arrayList.remove(3);
        System.out.println(arrayList + "\n");

        System.out.println("Structures.LinkedArrayList Class:");
        LinkedArrayList<Integer> linkedArrayList = new LinkedArrayList<>();
        linkedArrayList.add(1);
        linkedArrayList.add(2);
        linkedArrayList.add(3);
        linkedArrayList.add(4);
        linkedArrayList.add(5);
        System.out.println(linkedArrayList);
        System.out.println("Set!");
        linkedArrayList.set(0, 0);
        linkedArrayList.set(4, 6);
        System.out.println(linkedArrayList);
        System.out.println("Remove!");
        linkedArrayList.remove(0);
        linkedArrayList.remove(3);
        System.out.println(linkedArrayList + "\n");
    }

}
