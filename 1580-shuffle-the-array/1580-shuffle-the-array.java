class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int index = 0;
        int moves = 0;
        for(int i = 0; i < nums.length; i++){
            if(index < nums.length){
                result[i] = nums[index];
            }
            index += n;
            if(index >= nums.length){
                moves++;
                index = moves;
            }
        }
        return result;
    }
}