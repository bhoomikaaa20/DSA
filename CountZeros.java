public class CountZeros {
    public static void main(String[] args) {
        int n = 1020304;
        int sum = 0;
        int res = ZeroCount(n, sum);
        System.err.println(res);
    }

    static int ZeroCount(int n, int sum) {
        if (n == 0) {
            return sum;
        } else {
            int x = n % 10;
            if (x == 0) {
                sum++;
            }
            return ZeroCount(n / 10, sum);
        }
    }
}
