class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int index = 0;
        int moves = 0;
        for(int i = 0; i < nums.length; i++){
            result[i] = nums[index];
            index += n;
            if(index >= nums.length) index = ++moves;
        }
        return result;
    }
}