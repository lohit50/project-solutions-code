class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            if(nums[right] % 2 == 0){
                while(nums[left] % 2 == 0 && left < right) left++;
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            right--;
            if(nums[left] % 2 == 0) left++;
        }
        return nums;
    }
}