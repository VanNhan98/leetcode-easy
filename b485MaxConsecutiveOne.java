public class b485MaxConsecutiveOne {
    public static void main(String[] args) {
        int[] nums = {1, 1,1,1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums)); // Kết quả: 3
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
            }
            else
            {
                count = 0 ;
            }
            if(count > maxCount) {
                maxCount = count;
            }
        }
        return  maxCount ;
    }

}
