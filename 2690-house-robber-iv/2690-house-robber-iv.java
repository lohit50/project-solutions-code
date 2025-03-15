class Solution {
    public int minCapability(int[] nums, int k) {
        int l = Integer.MAX_VALUE;
        int r = Integer.MIN_VALUE;
        for(int i : nums){
            l = Math.min(l,i);
            r = Math.max(r,i);
        }
        while(l < r){
            int mid = (r + l) / 2;
            if(isCapable(mid,nums,k)) r = mid;
            else l = mid+1;
        }
        return l;
    }
    public boolean isCapable(int mid, int[] nums, int k ){
        int count = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] <= mid){
                count++;
                i++;
            }
            if(count >= k) return true;
        }
        return false;
    }
}