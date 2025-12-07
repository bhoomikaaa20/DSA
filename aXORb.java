public class aXORb {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        int aXor = XOR(a - 1);
        int bXor = XOR(b);
        int res = bXor ^ aXor;
        System.err.println(res);

    }

    static int XOR(int x) {
        if (x % 4 == 0) {
            return x;
        } else if (x % 4 == 1) {
            return 1;
        } else if (x % 4 == 2) {
            return (x + 1);
        } else {
            return 0;
        }
    }

}
