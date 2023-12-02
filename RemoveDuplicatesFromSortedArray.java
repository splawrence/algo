import java.util.HashSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        // int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] nums = { -3,-1,0,0,0,3,3};
        int[] expectedNums = {1}; // The expected answer with correct length
        
        int k = removeDuplicates(nums); // Calls your implementation
        System.out.println(k);
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }

    }

    private static int removeDuplicates(int[] nums) {
        Set<Integer> uniqueNumsSet = new HashSet<>();
        for (int num : nums) {
            uniqueNumsSet.add(num);
        }
        Integer[] uniqueNumsArray = uniqueNumsSet.toArray(new Integer[0]);

        Arrays.sort(uniqueNumsArray);
        for(int i = 0; i < nums.length; i++) {
            if(i <= uniqueNumsArray.length -1) {
                nums[i] = uniqueNumsArray[i];
            } else {
                nums[i] = 0;
            }

        }
        System.out.println(Arrays.asList(uniqueNumsArray).toString());

        return uniqueNumsArray.length;
    }
}