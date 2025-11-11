class binarySearch2DSorted {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int target = 15;
        int[] res = BSSorted(arr, target);
        System.out.println(res.toString());

    }

    static int[] BinarySearch(int[][] arr, int start, int end, int target, int rowstart) {
        int low = start;
        int high = end;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[rowstart][mid] == target) {
                return new int[] { rowstart, mid };
            } else if (target < arr[rowstart][mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] BSSorted(int[][] arr, int target) {
        int rowStart = 0;
        int rowEnd = arr.length - 1;
        int colMid = (arr[0].length - 1) / 2;

        while (rowStart < rowEnd - 1) {
            System.out.println("In this");

            int mid = rowStart + (rowEnd - rowStart) / 2;
            if (target == arr[mid][colMid]) {
                System.out.println("in this");
                return new int[] { mid, colMid };
            } else if (target < arr[mid][colMid]) {
                System.out.println("in this 2");
                rowEnd = mid;
            } else {
                System.out.println("In this 3");
                rowStart = mid;
            }
        }
        System.out.println("end");
        if (arr[rowStart][colMid] == target) {
            System.out.println("FOund one");
            return new int[] { rowStart, colMid };
        }
        if (arr[rowStart + 1][colMid] == target) {
            System.out.println("found two");
            return new int[] { rowStart + 1, colMid };
        }
        // first case
        if (arr[rowStart][colMid] >= target) {
            System.out.println("first");
            return BinarySearch(arr, 0, colMid - 1, target, rowStart);
        }
        // second case
        if (arr[rowStart][colMid] <= target && target <= arr[rowStart][rowEnd]) {
            System.out.println("second");
            return BinarySearch(arr, colMid + 1, arr[0].length - 1, target, rowStart);
        }
        // Third case
        if (arr[rowStart + 1][colMid] >= target) {
            System.out.println("third");
            return BinarySearch(arr, 0, colMid - 1, target, rowStart + 1);
        }
        // fourth case
        if (arr[rowStart + 1][colMid] <= target && target <= arr[rowStart][rowEnd]) {
            System.out.println("fourth");
            return BinarySearch(arr, colMid + 1, arr[0].length - 1, target, rowStart + 1);
        }
        System.out.println("emnd 2");
        return new int[] { -1, -1 };
    }
}