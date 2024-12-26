class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k == 0 || nums.length == 1 || nums.length == k) return;
        int index = 0;
        k = k%n;
        int[] copy = new int[n];
        for(int i=n-k;i<n+n-k;i++){
            if(i<n){
                copy[index] = nums[i];
            }else{
                copy[index] = nums[i-n];
            }
            index++;
        }
        for(int i=0;i<n;i++){
            nums[i] = copy[i];
        }
        
    }
}