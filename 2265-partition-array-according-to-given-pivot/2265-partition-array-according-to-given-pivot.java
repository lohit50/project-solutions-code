class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int index = 0;
        int pass = 0;
        while(pass < 3){
            for(int i = 0; i < nums.length ; i++){
                if(pass == 0 && nums[i] < pivot) result[index++] = nums[i];
                else if(pass == 1 && nums[i] == pivot) result[index++] = nums[i];
                else if(pass == 2 && nums[i] > pivot) result[index++] = nums[i];
            }
            pass++;
        }
        return result;
    }
}