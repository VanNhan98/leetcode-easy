public class B541ReverseString2 {
    public static void main(String[] args) {
        String s = "a";
        int k  = 2;
        System.out.println(reverseStr(s, k));
    }

    public static String reverseStr(String s, int k) {
        char [] c = s.toCharArray();
        for (int i = 0; i < s.length() ; i += 2 * k) {
            int l = i ; int r = Math.min(i + k - 1, s.length() - 1);
            while(l < r) {
                char temp = c[l];
                c[l] = c[r];
                c[r] = temp;
                l++; r--;
            }
        }
        return new String(c);

    }
}
