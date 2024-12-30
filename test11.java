public class test11 {
    public static void main(String[] args) {
        int [] a= {1,2,9,3,1,3,9,5,6,9} ;
        System.out.println(nhan(a));
    }

    public static int nhan(int[] a) {
        int count = 0 ;
        for (int i = 0; i < a.length ; i++) {
            if (a[i] == 9) {
                count ++;
                if(count == 3) {
                    return i;
                }
            }
        }
        return -1;
    }
}
