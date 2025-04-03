class Solution {
    public long maximumTripletValue(int[] nums) {
        long max = 0;
        int max_minus = 0;
        int max_num = 0;
        for(int num : nums){
            max = Math.max( max , (long)max_minus * num );
            max_minus = Math.max(max_minus , max_num - num);
            max_num = Math.max( max_num , num);
        }
        return max;
    }
}
