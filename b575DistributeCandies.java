import java.util.HashSet;

public class b575DistributeCandies {
    public static void main(String[] args) {
        int [] candyType = {1,1,2,2,3,3};
        System.out.println(distributeCandies(candyType));
    }

    public static int distributeCandies(int[] candyType) {
        int a = candyType.length / 2;
        HashSet<Integer> hs = new HashSet<>();
        for (int i : candyType) {
            if(hs.size() >= a)
            {
                return hs.size();
            }
            hs.add(i);
        }
        return hs.size();

    }
}
