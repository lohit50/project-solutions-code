class Solution {
    public boolean divideArray(int[] nums) {
//         int[] frequency = new int[501];
//         int xor = nums[0];
//         frequency[nums[0]]++;
//         for(int i = 1; i < nums.length; i++){
//             frequency[nums[i]]++;
//             xor = xor ^ nums[i];
//         }
//         if(xor != 0) return false;
//         for(int i = 0; i < frequency.length; i++) if(frequency[i] % 2 != 0) return false;
        int[] frequency = new int[501];
        for (int num : nums) frequency[num]++;
        for (int count : frequency) if (count % 2 != 0) return false;
        return true;
    }
}

