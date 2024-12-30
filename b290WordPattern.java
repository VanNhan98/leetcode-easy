import java.util.HashMap;
import java.util.Map;

public class b290WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
                char c = pattern.charAt(i);
                String word = words[i];
                if (map.containsKey(c)) {
                    if(!map.get(c).equals(word)){
                        return false;
                    }
                }

                else if(!map.containsKey(c)) {
                    if(map.containsValue(word)) {
                        return false;
                    }
                    else {
                        map.put(c, word);
                    }
                }

        }
        return true;
    }
}
