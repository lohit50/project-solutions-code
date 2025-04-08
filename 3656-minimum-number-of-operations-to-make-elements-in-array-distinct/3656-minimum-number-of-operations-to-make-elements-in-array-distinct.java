import java.util.*;

class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        
        // Go from end to start
        for (int i = nums.length - 1; i >= 0; i--) {
            if (!seen.add(nums[i])) {
                // Duplicate found!
                return (i + 3) / 3;  // Min number of 3-block removals
            }
        }
        
        return 0; // No duplicates at all
    }
}
