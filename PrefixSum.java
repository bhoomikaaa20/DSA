public class PrefixSum {
    public static void main(String[] args) {
        int[] arr1 = { 3, 7, 2, 5, 8 };
        int[] arr2 = new int[5];
        arr2[0] = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            arr2[i] = arr2[i - 1] + arr1[i];
        }

        for (int j = 0; j < arr2.length; j++) {
            System.err.print(arr2[j] + " ");
        }
    }
}
