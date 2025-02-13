import java.util.HashMap;

public class b219ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,1};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(h.containsKey(nums[i])) {
                if(i - h.get(nums[i]) <= k) {
                    return true;
                }
                else {
                    h.put(nums[i], i);
                }
            }
            else {
                h.put(nums[i], i);
            }
        }
    return false;
    }
}
