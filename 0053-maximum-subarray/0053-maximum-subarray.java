class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int current_max = 0;
        for(int i=0;i<nums.length;i++){
            current_max += nums[i];
            if(current_max>max){
                max = current_max;
            }
            if(nums[i]>max){
                max = nums[i];
            }
            if(current_max<0){
                current_max = 0;
            }
        }
        return max;
    }
}