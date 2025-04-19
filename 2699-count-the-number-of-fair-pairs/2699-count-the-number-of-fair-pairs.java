class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return BS(nums, upper + 1) - BS(nums, lower);
    }
    public static long BS(int[] nums, int target){
        int left  = 0;
        int right = nums.length - 1;
        long count = 0;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum < target){
                count += (right - left);
                left++;
            }
            else{
                right--;
            }
        }
        return count;
    }
}
