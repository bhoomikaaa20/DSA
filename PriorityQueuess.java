
import java.util.*;

public class PriorityQueuess {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(6);
        pq.add(10);
        pq.add(5);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.peek());

    }
}
