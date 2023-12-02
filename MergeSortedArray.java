import java.util.Arrays;
public class MergeSortedArray{
    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    public static void main(String[] args) {
        // case one
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println("nums1 "+Arrays.toString(nums1));
        System.out.println("m "+ m);
        System.out.println("nums2 "+Arrays.toString(nums2));
        System.out.println("n "+ n);

        // case two
        int[] nums3 = {0};
        int m1 = 0;
        int[] nums4 = {1};
        int n1 = 1;
        merge(nums3, m1, nums4, n1);
        System.out.println("nums1 "+Arrays.toString(nums3));
        System.out.println("m "+ m1);
        System.out.println("nums2 "+Arrays.toString(nums4));
        System.out.println("n "+ n1);
    }
    
}
