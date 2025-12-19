public class SubStrings {
    public static void main(String[] args) {
        String up = "abc";
        String p = "";
        SubStr(up, p);
    }

    static void SubStr(String up, String p) {
        if (up == "") {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        SubStr(up.substring(1), p + ch);
        SubStr(up.substring(1), p);
    }
}
