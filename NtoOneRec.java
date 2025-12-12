class NtoOneRec {
    public static void main(String[] args) {
        int n = 5;
        Num(n);

    }

    static void Num(int n) {
        if (n > 0) {
            System.err.println(n);
            Num(n - 1);
        } else {
            return;
        }
    }
}