import java.util.HashMap;

public class b205IsomorphicStrings {
    public static void main(String[] args) {
                String s = "abc";
                String t = "bdf";

                System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length()) return false;
        HashMap<Character, Character> hm1 = new HashMap<Character, Character>();
        HashMap<Character, Character> hm2 = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if(hm1.containsKey(charS)) {
                if(hm1.get(charS) != charT) {
                    return false;
                }
            }
            else {
                hm1.put(charS, charT); // Tạo ánh xạ mới
            }

            if(hm2.containsKey(charT)) {
                if(hm2.get(charT) != charS) {
                    return false;
                }
            }
            else {
                hm2.put(charT, charS); // Tạo ánh xạ mới
            }

        }
        return true;
    }
}
