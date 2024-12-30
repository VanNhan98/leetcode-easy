import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class b645SetMismatch {
    public static void main(String[] args) {
            int []n = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(n)));
    }

    public static int[] findErrorNums(int[] nums) {

        int n = nums.length;
        int[] result = new int[2]; // Chứa số bị lặp và số bị mất
        int sum = 0;
        int expectedSum = n * (n + 1) / 2;
        int duplicate = 0;

        for (int num : nums) {
            sum += num;

            if (nums[Math.abs(num) - 1] < 0) {
                duplicate = Math.abs(num);
            } else {
                nums[Math.abs(num) - 1] = -nums[Math.abs(num) - 1];
            }
        }

        // Số bị mất
        result[0] = duplicate; // Số bị lặp
        result[1] = expectedSum - (sum - duplicate); // Số bị mất

        return result;
    }
}
