import java.util.HashSet;

public class b202HappyNumber {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(n)); // true
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<Integer>();

        while (n != 1) {
            if(hs.contains(n)) {
                return false;
            }
            hs.add(n);
            n = sum(n);

        }
     return true;
    }

    public static int sum(int number) {
        int sum = 0;
        while (number > 0) {
            int m = number % 10 ;
            sum += m * m;
            number = number / 10;

        }
        return sum;
    }
}
