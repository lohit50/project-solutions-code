class Solution {
    public int longestSubsequence(int[] nums, int diff) {
        int maximum = 0;
        Map<Integer, Integer> map = new HashMap<>(); 
        for (int i = 0; i < nums.length; i++) {
            int need = nums[i] - diff;
            map.put(nums[i], map.getOrDefault(need,0) + 1);
            maximum = Math.max(maximum, map.get(nums[i]));
        }
        return maximum;
    }
}
