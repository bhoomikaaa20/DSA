public class FloorEle {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 17, 19, 22 };
        int target = 18;
        int res = FloorSearch(arr, target);
        System.out.println(res);
    }

    static int FloorSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
