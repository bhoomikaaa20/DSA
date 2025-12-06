public class findIthSetPos {
    public static void main(String[] args) {
        int n = 10;
        int position = 1;

        while ((n & 1) == 0) {
            n >>= 1;
            position++;
        }

        System.err.println(position);

    }
}
