class Solution {
    public int minimumOperations(int[] nums) {
        int[] arr = new int[101];
        int i;
        for(i = nums.length - 1; i >= 0; i--){
            arr[nums[i]]++;
            if(arr[nums[i]] > 1 ) break;
        }
        if(i == -1) return 0;
        i++;
        return (int) Math.ceil(i+2)/3;
    }
}