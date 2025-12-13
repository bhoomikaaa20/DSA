public class RevANumRec {
    public static void main(String[] args) {
        int n = 143;
        int res = RevNum(n, 0);
        System.err.println(res);
    }

    static int RevNum(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        return RevNum(n / 10, sum * 10 + n % 10);
    }

}
