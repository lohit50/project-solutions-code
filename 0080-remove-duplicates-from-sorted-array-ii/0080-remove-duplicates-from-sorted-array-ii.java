class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                if(count < 2){
                    nums[index++] = nums[i];
                    count++;
                }
            }else{
                nums[index++] = nums[i];
                count = 1;
            }
        }
        return index;
    }
}