public class b191NumberOf1Bit {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(hammingWeight(n)); // Output: 3
    }

    public static int hammingWeight(int n) {
        int sum = 0;
        if (n == 0) {
            return 0;
        }
        while (n > 0) {
            int remainder = n % 2;
            sum += remainder;
            n = n / 2;
        }
        return sum;

    }
}
