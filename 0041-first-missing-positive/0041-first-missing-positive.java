class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] result = new int[nums.length+1];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0 && nums[i] <= nums.length) result[nums[i]] += 1;
        }
        for(int i = 1; i < result.length; i++){
           if(result[i] == 0){
                return i;
           }
        }
        return nums.length + 1;
    }
}
