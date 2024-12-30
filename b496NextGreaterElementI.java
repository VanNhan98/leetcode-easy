import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class b496NextGreaterElementI {
    public static void main(String[] args) {
        int[] nums1 = {4,1,3,2};
        int[] nums2 = {1,3,4,2};
        int[] result = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> ngeMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                ngeMap.put(stack.pop(), num);
            }
            stack.push(num);
        }


        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
//            result[i] = ngeMap.getOrDefault(nums1[i], -1);
            if(ngeMap.containsKey(nums1[i])) {
                result[i] = ngeMap.get(nums1[i]);
            }
            else {
                result[i] = -1; // Gán giá trị mặc định nếu không tìm thấy
            }
        }

        return result;
    }
}
