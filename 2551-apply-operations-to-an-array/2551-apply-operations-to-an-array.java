class Solution {
    public int[] applyOperations(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length ; i++){
            if( i < nums.length - 1 && nums[i] == nums[i+1] ){
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0; 
            }
            if (nums[i] != 0) {
                if (index != i) {
                    nums[index] = nums[i];
                    nums[i] = 0;
                }
                index++;
            }
        }
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] != 0){
        //         nums[index++] = nums[i];
        //         if(index - 1 != i){
        //             nums[i] = 0;
        //         }
        //     }
        // }
        return nums;
    }
}