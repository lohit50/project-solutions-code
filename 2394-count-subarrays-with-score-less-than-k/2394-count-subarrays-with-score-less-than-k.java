class Solution {
    public long countSubarrays(int[] nums, long k) {
        long total = 0;
        int left = 0;
        int right = 0;
        long score = 0;
        while(right < nums.length){
            score += nums[right];
            while(score * (right - left + 1) >= k){
                score -= nums[left];
                left++;
            }
            total += right - left + 1;
            right++;
        }
        return total;
    }
}