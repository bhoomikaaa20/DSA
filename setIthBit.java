public class setIthBit {
    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        int res = n | (1 << 2);
        System.err.println(res);
    }
}
