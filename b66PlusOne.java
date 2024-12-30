import java.util.ArrayList;
import java.util.Arrays;

public class b66PlusOne {
    public static void main(String[] args) {
        int [] a =  {9,9,9};
        int []result = plusOne(a);
        System.out.println(Arrays.toString(result));
    }

    public static int[] plusOne (int[] nums) {

        for (int i = nums.length - 1; i >= 0; i--) {

            if (nums[i] < 9) {
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }
        int[] newArray = new int [nums.length + 1];
        newArray[0] = 1;
        return newArray;

    }
}
