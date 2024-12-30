import java.util.Arrays;

public class b492ConstructTheRectangle {
    public static void main(String[] args) {
        int area = 37;
        int [] a = constructRectangle(area);
        System.out.println(Arrays.toString(a));
    }

    public static int[] constructRectangle(int area) {
        int l = 0, w = 0;
        for (int i = (int) Math.sqrt(area); i >=0  ; i--) {
            if(area % i == 0) {
                l = area / i;
                w = i;
                if(l>=w) {
                    return new int[] {l,w};
                }
            }
        }
        return new int[] {l,w};
    }

}
