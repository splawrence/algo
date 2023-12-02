import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!freq.containsKey(nums[i])) {
                freq.put(nums[i], 1);
            } else {
                freq.put(nums[i], freq.get(nums[i]) + 1);
            }
        }

        Optional<Entry<Integer, Integer>> maxEntry = freq.entrySet().stream().max(Map.Entry.comparingByValue());
        return (maxEntry.isPresent()) ? maxEntry.get().getKey() : -1;
    }
}
