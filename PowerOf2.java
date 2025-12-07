class PowerOf2 {
    public static void main(String[] args) {
        int n = 100000;
        boolean res = (n & (n - 1)) == 0;
        System.out.println(res);
    }
}