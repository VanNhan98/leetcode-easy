import java.util.Arrays;

public class b344ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString(char[] s) {
//        int l = 0;
//        int r = s.length - 1;
//
//        while (l < r) {
//            char temp = s[l];
//            s[l] = s[r];
//            s[r] = temp;
//
//            l++;
//            r--;
//        }
        StringBuilder sb = new StringBuilder();

        for (char c : s) {
            sb.append(c);
        }

        sb.reverse();

        for (int i = 0; i < s.length; i++) {
            s[i] = sb.charAt(i);
        }

    }

}
