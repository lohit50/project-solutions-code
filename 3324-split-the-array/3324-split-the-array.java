class Solution {
    public boolean isPossibleToSplit(int[] nums) {

        // // hastechnique : 
        // HashMap <Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0) +1);
        // }
        // for(int i =0;i<nums.length;i++){
        //     if(map.get(nums[i]) > 2){
        //         return false;
        //     }
        // }
        // return true;

        int[] count = new int[1000];
        for(int num:nums){
            count[num]++;
            if(count[num] > 2){
                return false;
            }
        }
        return true;
    }
}