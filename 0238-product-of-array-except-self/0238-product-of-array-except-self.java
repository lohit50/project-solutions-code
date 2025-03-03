class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = 1;
        int zeros = 0;

        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] != 0) total *= nums[i];
            else zeros++;
        }

        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0 && zeros <= 1) result[i] = total;
            else if(zeros == 0)            result[i] = total/nums[i];
        }
        return result;
    }
}