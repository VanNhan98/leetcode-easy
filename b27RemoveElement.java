public class b27RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        int result = removeElement(nums, val);
        System.out.println(result);
    }

    public static int removeElement(int[] nums, int val) {
            int count =  0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] != val) {
                    nums[count] = nums[i];
                    count++;
                }
            }
            return count;
    }
}
