class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] combined = new int[nums1.length + nums2.length + 1];
        System.arraycopy(nums1, 0, combined, 0, nums1.length);
        System.arraycopy(nums2, 0, combined, nums1.length+1, nums2.length);
        combined[nums1.length] = 6969;
        System.out.println(Arrays.toString(combined));

        int[] result = new int[combined.length];
        int index = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int flag = 0;
        for(int i : combined){
            if(i == 6969) flag = 1;
            else if(flag == 0) map.put(i, map.getOrDefault(i, 0) + 1);
            else if(flag == 1){
                if(map.containsKey(i)){
                    if(map.get(i) < 0) continue;
                    else{
                        map.put(i, map.getOrDefault(i, 0) - 1000000);
                        result[index++] = i;
                    }
                }
            }
        }
        System.out.printf("answer finding array \n");
    
        return Arrays.copyOf(result,index);
    }
}