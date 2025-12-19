class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        MergeSort(arr, 0, arr.length - 1);

    }

    static int[] MergeSort(int[] arr, int start, int end) {
        if (start == end) {
            return new int[] { arr[start] };
        }
        int mid = start + (end - start) / 2;
        int[] left = MergeSort(arr, 0, mid);
        int[] right = MergeSort(arr, mid + 1, end);

        return Merge(left, right);

    }
}