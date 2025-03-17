class Solution {
    public boolean divideArray(int[] nums) {
        int[] frequency = new int[501];
        
        for (int num : nums) {
            frequency[num]++;
        }
        
        for (int count : frequency) {
            if ((count & 1) != 0) return false;
        }
        return true;
    }
}