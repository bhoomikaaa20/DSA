//Finding weather numbver is evne or odd using AND Operator

class EvenOddAND {
    public static void main(String[] args) {
        int n = 46;
        boolean res = EO(n);
        System.err.println(res);
    }

    static boolean EO(int n) {
        return (n & 1) == 1;
    }
}