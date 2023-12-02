import java.util.HashSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public class ApplyOperationsToAnArray {
    public static void main(String[] args) {
        // int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] nums = {1,2,2,1,1,0};
        applyOperations(nums); // Calls your implementation
        System.out.println(Arrays.toString(nums));
    }

    private static void applyOperations(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] == nums[j]) {
                nums[i] = nums[i]*2;
                nums[j] = 0;
            }
            i++;
        }
        moveZeroes(nums);
    }
    private static void moveZeroes(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        while(i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}