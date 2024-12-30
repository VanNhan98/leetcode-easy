import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class b349InsertOfTwoArray {
    public static void main(String[ ] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for (int num : nums1) {
            s1.add(num);
        }

        for (int num : nums2) {
            if(s1.contains(num))
                s2.add(num);
        }

        int [] result = new int[s2.size()];
        int i = 0;
        for (int num : s2) {
            result[i] = num;
            i++;
        }

        return result;
    }
}
