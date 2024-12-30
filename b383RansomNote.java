import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b383RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
//        Map<Character, Integer> map = new HashMap<>();
//
//        for (char c : ransomNote.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//
//        for (char c : magazine.toCharArray()) {
//            if (!map.containsKey(c) || map.get(c) == 0) {
//                return false;
//            }
//            map.put(c, map.get(c) - 1);
//        }
//        return true;
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();

        for (char c : ransomNote.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : magazine.toCharArray()) {
            if (map.containsKey(c) && map.get(c) > 0) {
                list.add(c);
                map.put(c, map.get(c) - 1);
            }
            if(list.size() == ransomNote.length()) {
                return true;
            }
        }
        return false;
    }
}
