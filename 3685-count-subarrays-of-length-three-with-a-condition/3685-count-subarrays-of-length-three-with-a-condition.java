class Solution {
    public int countSubarrays(int[] nums) {

        if((nums[0] + nums[2])*2 == nums[1]) nums[0] = 1;
        else nums[0] = 0;

        for(int i = 2; i < nums.length - 1; i++){
            if((nums[i-1] + nums[i+1])*2 == nums[i]) nums[0]++;
        }

        return nums[0];
    }
}