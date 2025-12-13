public class SumNtoOneRec {
    public static void main(String[] args) {
        int n = 5;
        int res = SumNtoOne(n);
        System.err.println(res);
    }

    static int SumNtoOne(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + SumNtoOne(n - 1);
        }
    }
}
