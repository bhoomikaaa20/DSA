public class IthBit {
    public static void main(String[] args) {
        int n = 374;
        int i = 7;
        int res = (n >> i) & 1;
        System.err.println(res);
    }

}
