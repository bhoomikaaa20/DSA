public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {
                2, 4, 7, 10, 12, 14, 17, 19, 22, 24,
                27, 29, 31, 34, 36, 38, 40, 43, 45, 47,
                49, 51, 53, 55, 57, 59, 61, 63, 65, 67,
                69, 71, 73, 75, 77, 79, 81, 83, 85, 87,
                89, 91, 93, 95, 97, 99, 101, 103, 106, 108,
                111, 113, 116, 118, 120, 123, 126, 129, 132, 134,
                136, 139, 142, 145, 148, 151, 154, 157, 160, 163
        };

        int target = 120;
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            System.out.printf("Start is %d and end is %d", start, end);
            System.out.println("========");
            start = end + 1;
            end = start * 2 + 1;
        }

        int res = InfiniteSearch(arr, target, start, end);
        System.out.println(res);
    }

    static int InfiniteSearch(int[] arr, int target, int s, int e) {
        int start = s;
        int end = e;

        for (int i = start; i <= end; i++) {

            int mid = start + ((end - start) / 2);
            if (target == arr[mid]) {

                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
