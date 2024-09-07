class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul = 1;
        int n = nums.length;
        for(int i=0;i<n;i++){
            mul *= nums[i];
        }
        System.out.printf("%d\n",mul);
        int[] res = new int[n];
        int rightmul = 1;
        int leftmul = 1;
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                for(int j=i+1;j<n;j++){
                    leftmul*=nums[j];
                }
                res[i] = leftmul*rightmul;
            }else{
                res[i] = mul/nums[i];
            }
            rightmul *= nums[i];
        }
        return res;
    }
}