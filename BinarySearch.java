public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 10, 34, 55, 66, 77, 88, 99, 100, 123 };
        int target = 100;
        int res = BS(arr, target);
        System.out.println(res);
    }

    static int BS(int[] arr, int target) {
        int l = 0;
        int h = arr.length - 1;

        for (int i = l; i <= h; i++) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {

                h = mid - 1;

            } else {
                l = mid + 1;

            }

        }
        return -1;
    }
}
