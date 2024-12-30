public class b643MaxAverageSubI {
    public static void main(String[] args) {
//        int [] nums = {1,12,-5,-6,50,3};
        int [] nums = {5};
        int k = 1;
        System.out.println(findMaxAverage(nums,k));
    }

    public static double findMaxAverage(int[] nums, int k) {
       double sum = 0;
       double maxSum = 0;
        for (int i = 0; i < k ; i++) {
            sum += nums[i];
        }

        maxSum = sum;

        for (int i = k; i < nums.length ; i++) {
            sum = sum + nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum / k;
    }
}
