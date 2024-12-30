public class b35_SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 4;
        System.out.println(searchInsert(nums, target));
    }

    private static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
             if (i < nums.length - 1 && nums[i] < target && nums[i + 1] > target) {
                return i + 1;
            }
            if(target < nums[0]) {
                return 0;
            }

        }

        return nums.length;
    }
}
