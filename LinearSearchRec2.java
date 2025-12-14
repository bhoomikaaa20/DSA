import java.util.*;

public class LinearSearchRec2 {

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 18, 18, 9, 18 };
        int target = 18;
        ArrayList<Integer> li = new ArrayList<>();

        LSR(arr, target, 0, li);

        System.err.println(li);
    }

    static void LSR(int[] arr, int target, int start, List<Integer> li) {
        if (start == arr.length) {
            return;
        }
        if (arr[start] == target) {
            li.add(start);

        }
        LSR(arr, target, start + 1, li);

    }
}
