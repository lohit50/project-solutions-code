class Solution {
    public long countSubarrays(int[] nums, int k) {
        // finding max of the array : 
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(max < nums[i]) max = nums[i];
        }

        // subarray determining
        long count = 0;
        int left = 0;
        int right = 0;
        int tempCount = 0;
        while(right < nums.length){
            if(nums[right] == max) tempCount++;
            while(tempCount >= k){
                count += nums.length - right;
                if(nums[left] == max) tempCount--;
                left++;
            }
            right++;
        }
        return count;
    }
}