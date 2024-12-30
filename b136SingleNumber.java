import java.util.HashMap;

public class b136SingleNumber {
    public static void main(String[] args) {
            int [] nums = {1,2,2};
            System.out.println(singleNumber(nums)); // Kết quả: 1
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}
