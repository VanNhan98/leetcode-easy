import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class b448findallnumbersdisappearedinanarray {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 9, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
//
        List<Integer> r = new ArrayList<Integer>();
        int max = nums[0];
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }

        }

        int[] a = new int[max + 1];

        for (int i = 0; i < nums.length - 1 ; i++) {
            a[nums[i]]++;
        }
        for (int i = 1; i < nums.length; i++) {
            if (a[i] == 0)
                r.add(i);
        }
        return r;
    }
}
