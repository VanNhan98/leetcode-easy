public class test2 {
    public static void main(String[] args) {
        int n = 35;
        System.out.println(sumFive(n));
    }

    public static int sumFive(int n) {
        int sum = 0;
        for (int i = 1; i < n ; i++) {
            if(i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
