class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        int[] arr = new int[101];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < k) return -1;
            if(arr[nums[i]] > 0 || nums[i] == k) continue;
            arr[nums[i]]++;
            count++;
        }
        return count;
    }
}