public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 1;
        int piv = findPivot(arr, target);

        int ans = -1;

        if (piv == -1) {
            // Normal binary search
            ans = BinarySearch(arr, target, 0, arr.length - 1);
        } else if (arr[piv] == target) {
            ans = piv;
        } else if (target >= arr[0]) {
            ans = BinarySearch(arr, target, 0, piv - 1);

        } else if (target < arr[0]) {
            ans = BinarySearch(arr, target, piv + 1, arr.length - 1);
        }
        System.out.println(ans);

    }

    static int BinarySearch(int arr[], int target, int start, int end) {
        int s = start;
        int e = end;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr, int target) {
        // 4 cases we have
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            }
            if (arr[mid] > arr[start]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
