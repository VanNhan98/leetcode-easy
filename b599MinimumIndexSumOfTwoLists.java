import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class b599MinimumIndexSumOfTwoLists {
    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String []list2 = {"KFC", "Nhan", "Burger King", "Shogun"};
        String[] result = findRestaurant(list1, list2);
        System.out.println(Arrays.toString(result));

    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        int minIndexSum = -1; ;
        List<String> l = new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            if(map.containsKey(list2[i])) {
                int indexSum = map.get(list2[i]) + i;
                if(minIndexSum == -1 || indexSum < minIndexSum) {
                    minIndexSum = indexSum;
                    l.clear();
                    l.add(list2[i]);
                }
                else if (indexSum == minIndexSum) {
                    l.add(list2[i]);
                }
            }
        }
        return l.toArray(new String[0]);
    }
}
