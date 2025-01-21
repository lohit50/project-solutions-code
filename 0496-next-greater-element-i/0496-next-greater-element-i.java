class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        int index = 0;
        for(int i=0;i<nums1.length;i++){
            int num = nums1[i];
            int flag = 0;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j] == num && flag == 0) flag = 1;
                if(flag == 1 && nums2[j]>num){
                    arr[index++] = nums2[j];
                    break;
                }
                if(j == nums2.length-1)          arr[index++] = -1;
            }
        }
        return arr;
    }
}