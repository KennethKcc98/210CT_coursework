import java.util.*;
public class TestQueue{
    public static void main(String [] args){
        Queue q = new Queue();

        q.enqueue(new Integer(1));
        q.enqueue(new Integer(2));
        q.enqueue(new Integer(3));
        q.enqueue("A");
        q.enqueue("B");
        q.enqueue("C");

        System.out.println(q);

        q.dequeue();

        System.out.println("Dequeue first: "+q);
    }
}