public class b441ArrangeCoin {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(arrangeCoins(n));
    }

    public static int arrangeCoins(int n) {
        if (n <= 0) return 0;

        int  i = 1;
        while (n > 0) {
            i++;
            n -= i;
        }
        return i - 1;
    }
}
