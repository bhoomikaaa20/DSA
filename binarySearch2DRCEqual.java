import java.util.Arrays;
//THis is for the matrices where they are row wise sorted and col wise sorted

public class binarySearch2DRCEqual {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 2, 3, 4, 5 }, { 4, 5, 6, 7 }, { 13, 14, 15, 16 } };
        int target = 11;
        String res = Arrays.toString(BS2D(arr, target));
        System.out.println(res);

    }

    static int[] BS2D(int arr[][], int target) {
        int r = 0;
        int c = arr.length - 1;
        while (r <= c) {
            if (target == arr[r][c]) {
                return new int[] { r, c };
            } else if (target > arr[r][c]) {
                r++;
            } else {
                c--;
            }
        }
        return new int[] { -1, -1 };
    }
}
