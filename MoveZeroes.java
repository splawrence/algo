import java.util.HashSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public class MoveZeroes {
    public static void main(String[] args) {
        // int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] nums = { 0,1,0,3,12};
        moveZeroes(nums); // Calls your implementation
        System.out.println(Arrays.toString(nums));
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