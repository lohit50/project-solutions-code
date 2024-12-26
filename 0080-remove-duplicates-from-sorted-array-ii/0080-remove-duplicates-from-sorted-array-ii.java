class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        int count = 1;
        int total = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                if(count < 2){
                    nums[index++] = nums[i];
                    count++;
                    total++;
                }
            }
            if(nums[i] != nums[i-1]){
                nums[index++] = nums[i];
                total++;
                count = 1;
            }
        }
        return total;
    }
}