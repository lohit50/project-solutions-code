class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num = m;
        for(int i=0;i<n;i++){
            nums1[num] = nums2[i];
            num++;
        }
        Arrays.sort(nums1);
    }
}