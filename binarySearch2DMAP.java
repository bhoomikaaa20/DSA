public class binarySearch2DMAP {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int target = 11;
        int res = BS2D(arr, target);
        System.out.println(res);

    }

    static int BS2D(int arr[][], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target > arr[i][3]) {
                System.out.println("In this");
            } else {
                int l = 0;
                int h = arr.length - 1;
                for (int j = l; j <= h; j++) {
                    int mid = (l + h) / 2;
                    if (target == arr[i][mid]) {
                        return mid;
                    } else if (target > arr[l][mid - 1]) {
                        l = mid + 1;
                    } else {
                        h = mid - 1;
                    }
                }
            }
        }

        return -1;
    }
}
