public class test1 {
    public static void main(String[] args) {
            int [] a = {2,4,6,8,9,3};
        System.out.println(Min(a));
    }

    public static int Min(int[] n) {
        int max = n[0];
        for (int i = 1; i < n.length ; i++) {
            if(n[i]  > max) {
                max = n[i];
            }
        }
        return max;
    }
}
