import java.util.Arrays;

public class b88MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {2,3,4,5,0,0,0};
        int[] nums2 = {1,3,6};
        merge(nums1,4,nums2,3 );
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       int i  = m - 1;
       int j  = n - 1;
       int k  = m + n - 1;
        while (k >= 0) {
            if (i < 0) {
                nums1[k] = nums2[j];
                j--;
            } else if (j < 0) {
                nums1[k] = nums1[i];
                i--;
            }
            else if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else if (nums1[i] <= nums2[j]) {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
}
