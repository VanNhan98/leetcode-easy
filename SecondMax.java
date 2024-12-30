public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 4, 5};
        int secondMax = findSecondMax(arr);
        System.out.println("Second maximum: " + secondMax);
    }

    public static int findSecondMax(int[] arr) {
        int max1 = arr[0];
        int max2 = arr[1];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2 && arr[i] < max1) {
                max2 = arr[i];
            }

        }
        return max2;
    }
}
