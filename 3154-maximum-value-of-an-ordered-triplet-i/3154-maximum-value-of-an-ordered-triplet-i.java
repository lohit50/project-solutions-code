class Solution {
    public long maximumTripletValue(int[] nums) {
        long max = 0;
        int n = nums.length;
        // Loop for left index (i)
        for (int left = 0; left < n - 2; left++) {
            // Loop for mid index (j), ensuring j > left
            for (int mid = left + 1; mid < n - 1; mid++) {
                // Loop for right index (k), ensuring k > mid
                for (int right = mid + 1; right < n; right++) {
                    long currentValue = (long)(nums[left] - nums[mid]) * nums[right];
                    max = Math.max(max, currentValue);
                }
            }
        }
        return max;
    }
}
