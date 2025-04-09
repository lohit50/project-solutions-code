class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        Set<Integer> set = new HashSet();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < k) return -1;
            if(set.contains(nums[i]) || nums[i] == k) continue;
            set.add(nums[i]);
            count++;
        }
        return count;
    }
}