import java.util.*;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Bhoomi");
        st.push("Tina");
        st.push("Rina");
        st.pop();
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        while (!st.isEmpty()) {
            System.out.println(st.pop());

        }

    }
}
