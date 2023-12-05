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
        // count of each occurance in map
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // get max value in
        Optional<Entry<Integer, Integer>> maxEntry = freq.entrySet().stream().max(Map.Entry.comparingByValue());
        return (maxEntry.isPresent()) ? maxEntry.get().getKey() : -1;
    }
}
