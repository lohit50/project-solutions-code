class Solution {
    public int maximumCount(int[] nums) {
        int pos_count = 0;
        int neg_count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[nums.length - 1 - i] > 0) pos_count++;
            if(nums[i] < 0) neg_count++;
        }
        return pos_count > neg_count ? pos_count : neg_count;
    }
}