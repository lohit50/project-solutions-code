class Solution {
    public int minOperations(int[] nums) {
        int minimum = 0;
        int Next_zero = 0;
        int i = 0;
        while( i < nums.length - 2){
            if(nums[i] == 1){
                i++;
                continue;
            }
            else{
                minimum++;

                // i change
                nums[i] = 1;

                // i+1 change
                if(nums[i] == 1) Next_zero = i+1;
                nums[i+1] ^= 1;

                // i+2 change
                if(nums[i+2] == 1 && Next_zero != i+1) Next_zero = i+2;
                nums[i+2] ^= 1;

            i = Next_zero;
            }
        }
        for(i = 0; i < nums.length; i++){
            if(nums[i] == 0) return -1;
        }
        if(minimum == 0) return 0;
        return minimum;
    }
}