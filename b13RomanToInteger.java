import java.util.HashMap;

public class b13RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int total = 0;
        int preValue = 0;
        for (int i = s.length() - 1; i >= 0 ; i--) {
            char currentChar = s.charAt(i);
            int currentValue = map.get(currentChar);
            if(currentValue >= preValue) {
                total += currentValue;
            }
            else {
                total -= currentValue;
            }
            preValue = currentValue;
        }
        return total;
    }
}
