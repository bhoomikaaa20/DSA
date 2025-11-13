public class FindRotatoryCount {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 6, 7, 0, 1, 2, 2 };
        int target = 5;
        int piv = FindPivot(arr, target);
        System.out.println(piv + 1);
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

}
