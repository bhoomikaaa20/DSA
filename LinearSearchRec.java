public class LinearSearchRec {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 18, 9 };
        int target = 9;
        int res = LSR(arr, target, 0);
        System.err.println(res);
    }

    static int LSR(int[] arr, int target, int start) {
        if (arr[start] == target) {
            return start;
        }
        if (start == arr.length - 1) {
            return -1;
        }
        return LSR(arr, target, start + 1);

    }
}
