import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 9;
        int[] result = sum(arr, target);

        // In kết quả
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    private static int[] sum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            int b = target  - arr[i];
            if(map.containsKey(b)) {
                return new int [] {map.get(b), i};
            }
            map.put(arr[i] , i);
        }
        return null;

    }

}

