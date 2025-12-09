public class SquareRoot {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        double res = SQRT(n, p);
        System.err.printf("%.3f", res);

    }

    static double SQRT(int n, int p) {
        int start = 1;
        int end = n;
        double ans = 0.0;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == n) {
                return mid; // Perfect Square
            } else if (mid * mid < n) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        double precision = 0.1;
        for (int i = 0; i < p; i++) {
            while (ans * ans <= n) {
                ans = ans + precision;
            }
            ans = ans - precision; // step back
            precision = precision / 10;

        }

        return ans;
    }
}
