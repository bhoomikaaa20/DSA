public class LinSearchString {
    public static void main(String[] args) {
        String s = "Bhoomika";
        char tar = 'm';
        int res = LinSearch(s, tar);
        System.out.println(res);
    }

    static int LinSearch(String s, char tar) {
        if (s.length() == 0) {
            return -1;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == tar) {
                return i;
            }
        }
        return -1;
    }
}
