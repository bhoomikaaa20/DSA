public class SkipAWord {
    public static void main(String[] args) {
        String s = "Hello This is Bhoomika";
        String ans = "";
        SkippingWord(s, ans);

    }

    static void SkippingWord(String s, String ans) {
        if (s.isEmpty()) {
            System.out.println(ans);
            return;
        } else if (s.startsWith(" is")) {
            SkippingWord(s.substring(3), ans);
        } else {
            char ch = s.charAt(0);
            ans = ans + s.charAt(0);
            SkippingWord(s.substring(1), ans);
        }
    }

}
