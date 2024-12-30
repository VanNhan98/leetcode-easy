public class b557ReverseWordsInStringII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

//    public static String reverseWords(String s) {
//        String[] words = s.split("\\s+");
//        StringBuilder sb = new StringBuilder();
//        for (String word : words) {
//            StringBuilder sb2 = new StringBuilder(word);
//            sb2.reverse();
//            sb.append(sb2).append(" ");
//        }
//        return sb.toString().trim();
//    }
    public static String reverseWords(String s) {
        char[] c = s.toCharArray();
        int  l = 0;
        for (int r = 0; r < c.length; r++) {
            if(c[r] == ' ') {
                reverse(c, l, r - 1);
                l = r + 1;
            }
        }
        reverse(c, l, c.length - 1);
        return new String(c);
    }

    public static void reverse(char[] c, int l, int r) {
        while(l < r) {
            char t = c[l];
            c[l] = c[r];
            c[r] = t;
            l++;
            r--;
        }

    }
}
