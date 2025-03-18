class Solution {
    public int longestNiceSubarray(int[] nums) {
        int longest = 1;
        int l = 0;
        int r = 0;

        while (r < nums.length) {
            if (checkAll(nums, l, r)) { 
                longest = Math.max(longest, r - l + 1);
                r++;
            } else {
                l++;
                if (l > r) r = l;
            }
        }
        return longest;
    }

    public boolean checkAll(int[] nums, int start, int end) {
        for (int i = start; i < end; i++) {
            if ((nums[end] & nums[i]) != 0) return false;
        }
        return true;
    }
}
