import java.util.HashMap;

public class b387FirstUniqueCharInString {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (map.get(c) == 1) {
//                return i;
//            }
//        }
//        return -1;

        int [] counts  = new int[26];
        for (int i = 0; i < s.length() ; i++) {
            int index = s.charAt(i) - 'a';
            counts[index]++;
        }

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (counts[index] == 1) {
                return i; // Trả về chỉ số của ký tự đầu tiên duy nhất
            }
        }

        return -1;
    }
}
