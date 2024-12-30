public class b70ClimbingStairs {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(climbStairs(n));
    }

        public static int climbStairs(int n) {
//            if (n <= 2) return n;
//            int[] dp = new int[n+1];
//            dp[1] = 1;
//            dp[2] = 2;
//            for (int i = 3; i <= n; i++) {
//                dp[i] = dp[i-1] + dp[i-2];
//            }
//            return dp[n];
            if (n == 0) return 1; // 1 cách để ở lại
            if (n == 1) return 1; // 1 cách để lên bước 1

            int first = 1; // Số cách để lên bước 0
            int second = 1; // Số cách để lên bước 1
            int ways = 0; // Biến để lưu số cách lên bước n

            for (int i = 2; i <= n; i++) {
                ways = first + second; // Số cách để lên bước i
                first = second; // Cập nhật first cho bước tiếp theo
                second = ways; // Cập nhật second cho bước tiếp theo
            }

            return ways; // Trả về số cách lên bước n
        }
    }
