import java.util.HashSet;
import java.util.Set;

public class b217ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
