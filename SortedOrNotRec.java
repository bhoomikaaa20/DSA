public class SortedOrNotRec {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3 };
        boolean res = Sorted(arr, 0);
        System.err.println(res);
    }

    static boolean Sorted(int[] arr, int start) {
        if (start == arr.length - 1) {

            return true;
        }

        return (arr[start] < arr[start + 1]) && Sorted(arr, start + 1);

    }
}
