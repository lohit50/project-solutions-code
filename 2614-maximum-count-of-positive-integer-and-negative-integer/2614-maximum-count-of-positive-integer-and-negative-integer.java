class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int countNegative = 0;
        int countPositive = 0;

        // if(nums[0] < 0 && nums[n-1] < 0){
        //     return n;
        // }else if(nums[0] > 0 && nums[n-1] > 0){
        //     return n;
        // }

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                countNegative++;
            } else if (nums[i] > 0) {
                countPositive++;
            }
        }

        return Math.max(countNegative, countPositive);
    }
}
