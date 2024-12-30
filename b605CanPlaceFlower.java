public class b605CanPlaceFlower {
    public static void main(String[] args) {
        int [] flowerbed = {0,0,0,0,0}; int n =3;
        System.out.println(canPlaceFlowers(flowerbed,n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0 ;
        int length = flowerbed.length;
        for (int i = 0; i < flowerbed.length ; i++) {
            if(flowerbed[i] == 0 ) {
                if(( i == 0 || flowerbed[i - 1] == 0) && (i == length - 1 || flowerbed[i + 1] == 0)) {
                    flowerbed[i] = 1;
                    count ++;
                }
            }
            if(count >= n) {
                return true;
            }
        }
        return false;
    }
}
