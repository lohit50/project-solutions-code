class Solution {
    public int minOperations(int[] nums) {
        int minimum = 0;
        int One_count = 0;
        int Next_zero = 0;
        int i = 0;
        while( i < nums.length - 2){
            if(nums[i] == 1){
                One_count++;
                i++;
                continue;
            }
            else{
                minimum++;

                // i change
                nums[i] = 1;
                One_count++;

                // i+1 change
                if(nums[i+1] == 1){
                    nums[i+1] = 0;
                    Next_zero = i+1;
                }else{
                    nums[i+1] = 1;
                }

                // i+2 change
                if(nums[i+2] == 1){
                    nums[i+2] = 0;
                    if(Next_zero != i+1){
                        Next_zero = i+2;
                    }
                } else{
                    nums[i+2] = 1;
                }
            i = Next_zero;
            }
            // System.out.println(Next_zero);
            // System.out.println(One_count);
            // System.out.println(Arrays.toString(nums));
        }
        for(i = 0; i < nums.length; i++){
            if(nums[i] == 0) return -1;
        }
        if(minimum == 0) return 0;
        return minimum;
    }
}