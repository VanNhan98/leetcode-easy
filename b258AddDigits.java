public class b258AddDigits {
    public static void main(String[] args) {
        int n = 38;
        System.out.println(addDigits(n));

    }

    public static int addDigits(int num) {
        if(num < 10) return num;

        while(num >= 10) {

            int sum = 0;
           while(num > 0) {
               int digit = num % 10;
               sum += digit;
               num = num / 10;
           }
            num = sum;
        }

        return num;
    }
}
