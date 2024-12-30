public class b367ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 18;
        System.out.println(isPerfectSquare(num)); // true
    }

    public static boolean isPerfectSquare(int num) {
        if (num < 1) {
            return false;
        }

        long l = 1 ;
        long r = num;
        while(l <= r) {
            long m =  (l + r) / 2 ;
            long s = m * m;
            if(s == num) return true;
            else if(s > num) r = m - 1;
            else l = m + 1;
        }
        return false;
    }
}
