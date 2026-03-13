import java.util.LinkedList;
import java.util.*;

class Dequeue {
    public static void main(String args[]) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        System.out.println(dq);
        dq.pollFirst();
        System.out.println(dq);
        dq.pollLast();
        System.out.println(dq);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

    }
}