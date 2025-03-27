import java.util.*;

class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        Map<Integer, Integer> map = new HashMap<>();

        // Step 1: Find the dominant element
        int dominant = -1, freq = 0;
        for (int num : nums) {
            int newCount = map.getOrDefault(num, 0) + 1;
            map.put(num, newCount);
            if (newCount > freq) {
                freq = newCount;
                dominant = num;
            }
        }

        // Step 2: Find the minimum valid split index
        int leftCount = 0; // Count of dominant element in left partition
        for (int i = 0; i < n; i++) {
            if (nums.get(i) == dominant) leftCount++;

            int leftSize = i + 1;
            int rightSize = n - leftSize;
            int rightCount = freq - leftCount; // Remaining count in the right partition

            if (leftCount * 2 > leftSize && rightCount * 2 > rightSize) {
                return i;
            }
        }
        return -1;
    }
}
