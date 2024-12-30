public class b231PowerOfTwo {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;

        while(n > 1) {
           if(n % 2 != 0) return false;
           n = n / 2;
        }
        return true;
    }
}
