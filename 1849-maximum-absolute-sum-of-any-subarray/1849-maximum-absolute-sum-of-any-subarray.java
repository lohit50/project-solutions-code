class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max_result = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = Math.max(nums[i], sum + nums[i]);
            max_result = Math.max(max_result, sum);
        }
        int min_result =  Integer.MAX_VALUE;
        sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = Math.min(nums[i], sum + nums[i]);
            min_result = Math.min(min_result, sum);
        }
        return Math.abs(min_result) > max_result ? Math.abs(min_result) : max_result;
    }
}