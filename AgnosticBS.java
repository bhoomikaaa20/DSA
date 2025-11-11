public class AgnosticBS {
    public static void main(String[] args) {
        int[] arr = { 77, 66, 55, 44, 33, 22, 11, 9, 8, 7, 6, 5 };
        int target = 11;
        boolean isAsc = arr[0] < arr[arr.length - 1];
        System.out.println(isAsc);
        int res = AGBS(arr, target, isAsc);
        System.out.println(res);
    }

    static int AGBS(int[] arr, int target, boolean isAssc) {
        int l = 0;
        int h = arr.length - 1;

        for (int i = l; i <= h; i++) {
            int mid = l + (h - l) / 2;
            if (target == arr[mid]) {
                return mid;
            } else {
                if (isAssc) {
                    if (target < arr[mid]) {
                        h = mid - 1;
                    } else {
                        l = mid + 1;
                    }
                } else {
                    if (target > arr[mid]) {
                        h = mid - 1;
                    } else {
                        l = mid + 1;
                    }
                }
            }
        }
        return -1;
    }
}
