class Solution {
    public int minOperations(int[] nums, int k) {

        
        int count=0;
        Arrays.sort(nums);
        int j=1;
        for(int i=0 ;i<nums.length;i++){
            if( j< nums.length && nums[i] != nums[j]){
               if(k < nums[i]){
                count++;
               }
            }
            if(k > nums[i]) return -1;
            j++;
        }
        if(k< nums[nums.length-1]) count++;
        return count;
    }
}