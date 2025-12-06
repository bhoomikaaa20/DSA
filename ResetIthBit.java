public class ResetIthBit {
    public static void main(String[] args) {
        int n = 10;
        int i = 4;
        int res = n & (~(1 << (i - 1)));
        System.err.println(res);

    }
}
