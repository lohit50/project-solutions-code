class Solution {
    public boolean canJump(int[] nums) {
        int EndIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > EndIndex) return false;
            EndIndex = Math.max(EndIndex,nums[i]+i);
        }
        return true;
    }
}