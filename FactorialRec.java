public class FactorialRec {
    public static void main(String[] args) {
        int n = 5;
        int res = Fact(n);
        System.err.println(res);
    }

    static int Fact(int n) {
        if (n == 1) {
            return 1;
        } else {

            return n * Fact(n - 1);
        }
    }
}
