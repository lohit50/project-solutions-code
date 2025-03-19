class Solution {
    public int minOperations(int[] nums) {
        int minimum = 0;
        int Next_zero = 0;
        int One_count = 0;
        int i = 0;
        while( i < nums.length - 2){
            if(nums[i] == 1){
                i++;
                One_count++;
                continue;
            }
            else{
                minimum++;
                // i change raa
                nums[i] = 1;
                One_count++;

                // i+1 change raa
                if(nums[i] == 1) Next_zero = i+1;
                else One_count++;
                nums[i+1] ^= 1;

                // i+2 change raa
                if(nums[i+2] == 1 && Next_zero != i+1) Next_zero = i+2;
                if(nums[i+2] == 0 && ((Next_zero != i+1) && (Next_zero != i+2))) One_count++;
                nums[i+2] ^= 1;

            i = Next_zero;
            }
        }
        if(nums[nums.length - 2] == 1 && nums[nums.length - 1] == 1){
           One_count += 2;
        }
        if(One_count != nums.length) return -1;
        if(minimum == 0) return 0;
        return minimum;
    }
}