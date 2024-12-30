public class arrayPalindrome {
    public static void main(String[] args) {
        int [] nums = {1,2,2,1};
        System.out.println(isPalindrome(nums));
    }

    public static boolean isPalindrome(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left]!= arr[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
