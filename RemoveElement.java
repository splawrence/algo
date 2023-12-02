import java.util.HashSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public class RemoveElement {
    public static void main(String[] args) {
        // int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] nums = { 3,2,2,3};
        int[] expectedNums = {2}; // The expected answer with correct length
        int val = 3;
        int k = removeElement(nums, val); // Calls your implementation
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }

    private static int removeElement(int[] nums, int val) {
        // two pointer solution
        // i is the slow pointer which is only incremented when nums j does not match val effectively skipping val
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}