import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        // int[] nums = {-1};
        // int k = 2;
        // int[] nums = {-1,-100,3,99};
        // int k = 2;
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int[] nums1 = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotateArrayUsingCopy(nums, k);
        rotateArrayUsingExtraArray(nums1, k);
    }

    private static void rotateArrayUsingCopy(int[] nums, int k) {
        if (nums.length == 1) {
            return;
        }

        k %= nums.length;

        int[] arr = new int[nums.length];

        System.arraycopy(nums, nums.length - k, arr, 0, k);

        System.arraycopy(nums, 0, arr, k, nums.length - k);

        System.arraycopy(arr, 0, nums, 0, nums.length);

        System.out.println("Using copy " + Arrays.toString(nums));
    }

    private static void rotateArrayUsingExtraArray(int[] nums, int k) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
        System.out.println("Using extra array " + Arrays.toString(nums));
    }

}
