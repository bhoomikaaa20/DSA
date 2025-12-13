public class DigSumRec {
    public static void main(String[] args) {
        int n = 143;
        int res = SumofDig(n);
        System.err.println(res);
    }

    static int SumofDig(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + SumofDig(n / 10);
    }
}
