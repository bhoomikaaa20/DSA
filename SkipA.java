class SkipA {
    public static void main(String[] args) {
        String s = "babca";
        String ans = "";

        SkippingA(s, ans);
    }

    static void SkippingA(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        if (s.charAt(0) == 'a') {
            SkippingA(s.substring(1), ans);
        } else {
            SkippingA(s.substring(1), ans + s.charAt(0));
        }

    }
}