class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] result = new int[Math.min(nums1.length,nums2.length)];
        int[] visited = new int[1001];
        int index = 0;

        for(int i : nums1){
            visited[i]++;
        }

        for(int i : nums2){
            if(visited[i]>0){
                result[index++] = i;
                visited[i]--;
            }
        }
        return Arrays.copyOf(result,index);
    }
}