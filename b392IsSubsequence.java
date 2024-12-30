import java.util.ArrayList;
import java.util.List;

public class b392IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
       int i1 = 0;
       int i2 = 0;
       while (i1 < s.length() && i2 < t.length()) {
           if (s.charAt(i1) == t.charAt(i2)) {
               i1++;
           }
           i2++;
       }
       return i1 == s.length();
//        char[] subString = s.toCharArray();
//        char[] mainString = t.toCharArray();
//
//        int i = 0;
//        int j = 0;
//        while(i<subString.length && j< mainString.length)
//        {
//            if(subString[i] == mainString[j])
//            {
//                i++;
//            }
//            j++;
//        }
//        return i == subString.length;

    }
}
