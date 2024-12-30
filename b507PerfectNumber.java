public class b507PerfectNumber {
    public static void main(String[] args) {
        int num = 7;
        System.out.println(checkPerfectNumber(num));

    }

    public static boolean checkPerfectNumber(int num) {
        if(num <= 1) return false;
        int sum  = 0;
        int a = num;
        for (int i = 1; i <= num / 2 ; i++) {
            if (num % i == 0) {
                sum += i;
            }

        }
        if(a == sum) {
            return true;
        }
        return false;
    }
}
