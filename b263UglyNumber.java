public class b263UglyNumber {
    public static void main(String[] args) {
        int n = 30;
        System.out.println(isUgly(n));

    }

    public static boolean isUgly(int n) {
        // Step 1: Check if n is less than or equal to 0
        if (n <= 0) {
            return false;
        }

        // Step 2: Divide n by 2, 3, and 5
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }

        // Step 3: Check if n has been reduced to 1
        return n == 1;
    }


}
