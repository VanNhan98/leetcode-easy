import java.util.Arrays;

public class b338CountingBits {
    public static void main(String[] args) {
        int n =5;
        int[] arr = countBits(n);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] countBits(int n) {

        int[] result = new int[n + 1];
        for(int i = 0; i <= n; i++) {
            int sum = 0;
            int bal = 0;
            int tempt = i;
            while(tempt > 0) {
                bal = tempt % 2;
                tempt = tempt / 2;
                sum += bal;
            }
            result[i] = sum;

        }
    return result;

    }
}
