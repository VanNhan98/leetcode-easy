public class b125ValidPalindrome {
    public static void main(String[] args) {
        String s = "plan, a canal: P";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() ; i++) {
            char c = s.charAt(i);
            if(Character.isLetter(c) || Character.isDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        String original = sb.toString();
        String reverse = sb.reverse().toString();

        return original.equals(reverse);
    }
}
