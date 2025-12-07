public class APowerB {
    public static void main(String[] args) {
        int base = 2;
        int pow = 10;
        int ans = 1;
        while (pow > 0) {
            if ((pow & 1) == 1) {
                ans = ans * base;
            }
            base *= base;
            pow >>= 1;
        }

        System.out.println(ans);
    }
}
