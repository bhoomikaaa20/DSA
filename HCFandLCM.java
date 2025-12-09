public class HCFandLCM {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int hcfres = HCF(a, b);
        int lcmres = LCM(a, b);
        System.err.println(hcfres);
        System.err.println(lcmres);
    }

    static int HCF(int a, int b) {
        if (a == 0) {
            return b;
        }
        return HCF(b % a, a);
    }

    static int LCM(int a, int b) {
        return a * b / HCF(a, b);
    }
}
