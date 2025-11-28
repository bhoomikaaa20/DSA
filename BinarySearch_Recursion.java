public class BinarySearch_Recursion {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 2;
        int res = BS(arr, target, 0, arr.length - 1);
        System.err.println(res);
    }

    static int BS(int[] arr, int target, int s, int e) {

        int mid = s + ((e - s) / 2);
        if (s > e) {
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return BS(arr, target, s, mid - 1);
        }
        return BS(arr, target, mid + 1, e);

    }
}
