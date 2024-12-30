public class b326PowerOfThree {
    public static void main(String[] args) {
        int n = 28;
        System.out.println(isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(int n) {
        if(n == 1) return true;

        else if (n <= 0 || n < 3) return false;
        while (n % 3 == 0) {
            n /= 3;
        }
        if(n == 1) {
            return true;
        }
        return false;
    }
}
