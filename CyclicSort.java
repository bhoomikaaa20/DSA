import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        int[] res = CS(arr);
        List<Integer> ans = new ArrayList<>();

        for (int j = 0; j < res.length; j++) {
            if (j != res[j] - 1) {
                {
                    ans.add(j + 1);

                }
            }
        }

        System.out.println(ans);

    }

    static int[] CS(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {

                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        return arr;
    }
}
