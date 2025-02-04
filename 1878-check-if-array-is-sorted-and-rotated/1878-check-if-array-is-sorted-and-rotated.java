class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        
        // for (int i = 0; i < n; i++) {
        //     if(i + 1 == n){
        //         if(nums[i] > nums[0]) count ++;
        //     }
        //     else{
        //         if (nums[i] > nums[i + 1]) count++;
        //     }
        // }

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) { 
                count++;
            }
        }
        
        return count <= 1; 
    }
}
