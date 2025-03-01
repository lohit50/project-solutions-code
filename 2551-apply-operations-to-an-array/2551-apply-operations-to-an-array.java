class Solution {
    public int[] applyOperations(int[] nums) {
        // int result[] = new int[nums.length];
        int index = 0;
        for(int i = 0; i < nums.length ; i++){
            if(i + 1 == nums.length){
                nums[i] = nums[i];
            }
            else if(nums[i] == nums[i+1] ){
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0; 
            }
            else{
                nums[i] = nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
                if(index - 1 != i){
                    nums[i] = 0;
                }
            }
        }
        return nums;
    }
}