
class LinearSearch {
    public static void main(String args[]) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 32 };
        int target = 30;
        int res = LinSearch(arr, target);
        System.out.println(res);
    }

    static int LinSearch(int[] arr, int tar) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                return i;
            }
        }
        return -1;
    }
}
