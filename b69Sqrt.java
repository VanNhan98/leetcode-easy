public class b69Sqrt {
    public static void main(String[] args) {
        int x = 12;
        System.out.println(mySqrt(x)); // Kết quả: 2

    }

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int left = 0, right = x;
        while (left <= right) {
            int mid = (right + left) / 2;
            if ((long) mid * mid > (long) x) right = mid - 1;
            else if (mid * mid == x) return  mid;
            else left = mid + 1;
        }
        return right;
    }

}
