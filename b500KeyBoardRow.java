import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class b500KeyBoardRow {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }

    public static String[] findWords(String[] words) {
        HashSet<Character> h1 = new HashSet<>();
        HashSet<Character> h2 = new HashSet<>();
        HashSet<Character> h3 =  new HashSet<>();
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";
        for (char c : r1.toCharArray()) h1.add(c);
        for (char c : r2.toCharArray()) h2.add(c);
        for (char c : r3.toCharArray()) h3.add(c);
        List<String> result = new ArrayList<>();
        for(String word  :words) {

            HashSet<Character> row;
            String lowerWord = word.toLowerCase();
           char firstChar = lowerWord.charAt(0);
           if(h1.contains(firstChar)) {
               row = h1;
           }
           else if(h2.contains(firstChar)) {
               row = h2;
           }
           else {
               row = h3;
           }
            StringBuilder sb = new StringBuilder();
           for (char c : lowerWord.toCharArray()) {
               if(!row.contains(c)) {
                   break;
               }
               else {
                   sb.append(c);
               }
           }
           if(sb.length() == lowerWord.length()) {
               result.add(word);
           }
        }
        return result.toArray(new String[0]);
    }
}
