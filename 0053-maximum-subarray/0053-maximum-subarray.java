class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
        int right = 0;
        int sum = 0;
        int result = Integer.MIN_VALUE;

        while(right < nums.length){
            sum  = Math.max(nums[right], sum + nums[right++]);
            result = Math.max(result,sum);
        }
        return result;
    }
}