public class RotatedBinarySearchDuplicates {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 6, 7, 0, 1, 2, 2 };
        int target = 5;
        int piv = FindPivot(arr, target);
        System.out.println(piv);
        int ans = -1;

        if (piv == -1) {
            ans = BinarySearch(arr, target, 0, arr.length - 1);
        } else if (arr[piv] == target) {
            ans = piv;
        } else if (target <= arr[piv]) {
            ans = BinarySearch(arr, target, 0, piv - 1);
        } else {
            ans = BinarySearch(arr, target, piv + 1, arr.length - 1);
        }

        System.out.println(ans);

    }

    static int FindPivot(int arr[], int target) {
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

            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // If the start or end is pivot then we should consider them
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            else if (arr[mid] > arr[start] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    static int BinarySearch(int arr[], int target, int start, int end) {
        int s = start;
        int e = end;
        while (s <= e) {
            int mid = s + ((e - s) / 2);
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
}
