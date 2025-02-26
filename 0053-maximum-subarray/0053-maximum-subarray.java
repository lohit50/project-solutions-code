class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
        int left = 0;
        int right = 0;
        int sum = 0;
        int result = Integer.MIN_VALUE;

        while(right < nums.length){
            sum += nums[right++];
            result = Math.max(result,sum);
            if(sum < 0){
                sum = 0;
                left = right;
            }
        }
        return result;
    }
}