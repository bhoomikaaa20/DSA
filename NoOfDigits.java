class NoOfDigits {
    public static void main(String[] args) {
        int n = 6;
        int b = 2;
        int ND = (int) (Math.log(n) / Math.log(b)) + 1;
        System.err.println(ND);
    }
}