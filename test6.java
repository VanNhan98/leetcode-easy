public class test6 {
    public static void main(String[] args) {
        int n  = 4;
        System.out.println(FirstFactorial(n));
    }

    public static int FirstFactorial(int num) {
        int sum = 1;
        for (int i = 1; i <= num ; i++) {
            sum *= i;
        }
        return sum;
    }
}
