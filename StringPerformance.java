public class StringPerformance {
    public static void main(String[] args) {
        char s = 'a';
        String str = "";
        for (int i = 0; i < 26; i++) {
            char r = (char) (s + i);
            str = str + r;
            System.out.println(str);
        }
    }
}
