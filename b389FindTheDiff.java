import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class b389FindTheDiff {
    public static void main(String[] args) {
        String s = "aa";
        String t = "aaa";
        char diff = findTheDifference(s, t);
        System.out.println(diff);
    }

    public static char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char num : s.toCharArray()) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (char num : t.toCharArray()) {
           if(!map.containsKey(num) || map.get(num) == 0) {
               return num;
           }
            map.put(num, map.get(num) - 1);
        }

        return ' ';
//        int s1 = 0, s2 = 0;
//        for (char c : s.toCharArray()) {
//            s1+=c;
//        }
//        for (char c : t.toCharArray()) {
//            s2+=c;
//        }
//        return (char) (s2-s1);
    }
}
