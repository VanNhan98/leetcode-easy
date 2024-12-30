import java.util.HashMap;

public class test3 {
    public static void main(String[] args) {
        int [] a = {1,1,3,4,5,5,7,7,7};
        System.out.println(countNumber(a));
    }

    public static int countNumber(int[] a) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i : a) {
            h.put(i, h.getOrDefault(i,0) + 1);
        }

        int count = 0;
        for (int i : h.keySet()) {
            if(h.get(i) > 1) {
                count ++;
            }
        }
        return count;
    }
}
