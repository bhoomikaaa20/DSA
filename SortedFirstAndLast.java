public class SortedFirstAndLast {
    public static void main(String[] args) {
        int[] arr = { 1, 7, 7, 7, 7, 7, 7, 7, 7, 7, 6, 8, 8 };
        int target = 7;
        int left = binarySearch(arr, target, true, 0, arr.length - 1);
        int right = binarySearch(arr, target, false, 0, arr.length - 1);
        System.out.println(left);
        System.out.println(right);
    }

    static int binarySearch(int[] arr, int target, boolean isLeftSearch, int start, int end) {
        int ans = -1;
        int s = start;
        int e = end;
        while (s <= e) {
            int mid = s + ((e - s) / 2);
            if (target == arr[mid]) {
                ans = mid;
                if (isLeftSearch) {
                    binarySearch(arr, target, true, s, mid - 1);
                } else {
                    binarySearch(arr, target, false, start + 1, e);
                }
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return ans;
    }
}
