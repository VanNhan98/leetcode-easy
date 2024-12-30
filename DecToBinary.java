public class DecToBinary {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(hammingWeight(n)); // Output: 3
    }

    public static int hammingWeight(int n) {
        StringBuilder sb = new StringBuilder();
        if (n == 0) {
            return 0;
        }

        while(n>0) {
            int result = n % 2;
            sb.append(result);
            n = n / 2;
        }
        int number = Integer.parseInt(sb.reverse().toString());
        return number;
    }
}
