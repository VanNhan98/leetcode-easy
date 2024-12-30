public class b509Fib {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;


    }
}
