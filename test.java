import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        // in ra vi tri index cua 1 character xuat hien 1 lan trong chuoi;
        String s = "eetcode";
        System.out.println(number(s));

    }

    public static int number(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) +1);
        }
        for (int i = 0; i < s.length() ; i++) {
            char c = s.charAt(i);
            if(map.get(c) == 1) {
                return i;
            }
        }
        return -1; // neu khong tim thay
    }

}
