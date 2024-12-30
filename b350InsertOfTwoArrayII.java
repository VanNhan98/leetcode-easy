import java.util.*;

public class b350InsertOfTwoArrayII {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] result = intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> m =  new HashMap<>();
        List<Integer> l =  new ArrayList<>();

       for (int num : nums1) {
            m.put(num, m.getOrDefault(num, 0) + 1);
       }

       for (int num : nums2) {
           if(m.containsKey(num) && m.get(num) > 0) {
               l.add(num);
               m.put(num, m.get(num) - 1);
           }
       }

        int[] result = new int[l.size()];
//        for (int i = 0; i < l.size(); i++) {
//            result[i] = l.get(i);
//        }
        int i = 0;
        for (int num : l) {
            result[i] = num;
            i++;
        }
        return result;
    }
}
