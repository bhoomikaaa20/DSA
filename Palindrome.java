public class Palindrome {
    public static void main(String[] args) {
        String s = "bhoohb";
        int count = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Not");
        } else {
            System.out.println("Palindrome");
        }
    }
}
