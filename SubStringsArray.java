import java.util.*;

public class SubStringsArray {
    public static void main(String[] args) {
        String up = "abc";
        String p = "";
        ArrayList<String> al = new ArrayList<>();
        SubStr(up, p, al);
        System.out.println(al);

    }

    static void SubStr(String up, String p, ArrayList<String> al) {
        if (up == "") {
            al.add(p);
            return;
        }
        char ch = up.charAt(0);
        SubStr(up.substring(1), p + ch, al);
        SubStr(up.substring(1), p, al);
        SubStr(up.substring(1), p + (ch + 0), al);

    }
}
