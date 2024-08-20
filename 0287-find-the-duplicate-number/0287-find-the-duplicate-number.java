class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        
        int[] posArr = new int[n];
        int[] negArr = new int[n];
        
        for (int num : nums) {
            if (num > 0) {
                if (posArr[num] != 0) {
                    return num;
                }
                posArr[num] = num;
            } else {
                int absNum = Math.abs(num);
                if (negArr[absNum] != 0) {
                    return absNum;
                }
                negArr[absNum] = num;
            }
        }
        
        return -1;
    }
}
