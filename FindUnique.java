public class FindUnique {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 3, 2, 1, 6, 5 };
        int res = FU(arr);
        System.err.println(res);
    }

    static int FU(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum ^ arr[i];
        }
        return sum;
    }
}
