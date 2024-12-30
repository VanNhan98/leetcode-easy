import java.util.HashMap;

public class b409LongestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int length  = 0;
        boolean odd = false;
        for(char c: s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0) + 1);
        }

        for (int count : map.values()) {
            if(count % 2 == 0) {
                length += count;
            }
            else {
                length += count - 1;
                odd = true;
            }
        }
        if(odd) {
            length += 1;
        }
        return length;
    }
}
