package QUEUE;
import java.util.*;

public class QueueusingJCF{
    public static void main(String[] args) {
      //  java.util.Queue<Integer> q = new java.util.LinkedList<>();

      java.util.Queue<Integer> q=new java.util.ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
            
        }
    }
}
