class Solution {
    public int maxAscendingSum(int[] nums) {
        if(nums.length == 1) return nums[0];
        int max = nums[0];
        int result = 0;
        for(int i = 1 ; i < nums.length; i++){
            if(nums[i - 1] < nums[i]){
                max += nums[i];
                System.out.println("added " + nums[i] + "to " + max);
            }else{
                result = Math.max(result,max);
                System.out.println(result);
                max = nums[i];
            }
            result = Math.max(result,max);
        }
    return result;
    }
}