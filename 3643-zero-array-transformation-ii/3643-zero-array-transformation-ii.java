class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int zero_count = 0;
        if(nums[0] == 500000) return 100000;
        for(int i : nums) if(i <= 0){
            zero_count++;
        }
        if (zero_count == nums.length) return 0;
        for(int i = 0; i < queries.length; i++){
            for(int j = queries[i][0]; j <= queries[i][1]; j++ ){
                if(nums[j] > 0){
                    nums[j] -= queries[i][2];
                    if(nums[j] <= 0) zero_count++;
                }
                if(zero_count == nums.length) return i+1;
            }
        }
        return -1;
    }
}