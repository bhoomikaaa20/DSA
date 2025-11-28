public class fibonocci_Recursion {
    public static void main(String[] args) {
        System.err.println(FS(8));
        ;

    }

    static int FS(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }

        return FS(n - 1) + FS(n - 2);
    }
}
