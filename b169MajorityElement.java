import java.util.HashMap;

public class b169MajorityElement {
    public static void main(String[] args) {
     int [] nums = {2,2,1,1,1,3,3};
        System.out.println(majorityElement(nums));
    }

//
public static int majorityElement(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : nums) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    int majorityElement = nums[0];
    int maxCount = 0;
  // Tìm phần tử có số lần xuất hiện lớn nhất
    for (int num : map.keySet()) {
        if (map.get(num) > maxCount) {
            maxCount = map.get(num);
            majorityElement = num; // Cập nhật phần tử chiếm ưu thế
        }
    }

    return majorityElement; // Trả về phần tử có số lần xuất hiện lớn nhất
}
}
