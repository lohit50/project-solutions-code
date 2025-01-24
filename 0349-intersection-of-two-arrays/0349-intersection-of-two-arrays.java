class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int index = 0;
        int[] visited = new int[1001];

        for(int i : nums1){
            visited[i] = 1;
        }

        for(int i : nums2){
            if(visited[i] == 1 ){
                result[index++] = i;
                visited[i] = 0;
            }
        }
        return Arrays.copyOf(result,index);
    }
}