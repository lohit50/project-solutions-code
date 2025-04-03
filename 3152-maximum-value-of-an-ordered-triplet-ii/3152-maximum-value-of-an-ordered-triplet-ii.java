class Solution {
    public long maximumTripletValue(int[] nums) {
        long result = 0;
        int max = 0;
        int minus_max = 0;
        for(int num : nums){
            result    = Math.max( result , (long) minus_max * num);
            minus_max = Math.max( minus_max , max - num);
            max       = Math.max( max , num);
        }
        return result;
    }
}