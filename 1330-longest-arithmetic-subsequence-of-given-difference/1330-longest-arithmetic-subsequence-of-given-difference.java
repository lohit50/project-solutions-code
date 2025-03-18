class Solution {
    public int longestSubsequence(int[] nums, int diff) {
        int maximum = 0;
        Map<Integer, Integer> memo = new HashMap<>(); 
        for (int num : nums) {
            int prev = num - diff;
            int count = memo.getOrDefault(prev, 0) + 1;  
            memo.put(num, count);
            maximum = Math.max(maximum, count);
        }
        return maximum;
    }
}
