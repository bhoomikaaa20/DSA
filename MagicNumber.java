public class MagicNumber {
    public static void main(String[] args) {
        int n = 7;
        int last;
        int mul = 5;
        int sum = 0;

        while (n > 0) {
            last = n & 1;
            sum = sum + (last * mul);
            mul = mul * 5;
            n = n >> 1;
        }

        System.err.println(sum);
    }

}
