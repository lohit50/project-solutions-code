class Solution {
    public int countPairs(int[] nums, int k) {
        int pairs = 0;
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         if((i * j) % k == 0 && nums[i] == nums[j]) pairs++;
        //     }
        // }
        HashMap<Integer, List<Integer>> map = new HashMap();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                List<Integer> ls = map.get(nums[i]);
                // add the new index inside !! :
                for(int index : ls){
                    if((i * index) % k == 0) pairs++;
                }
                ls.add(i);
                map.put(nums[i],ls);
                // map.get(nums[i]).add(i);
                continue;
            }
            map.put(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        return pairs;
    }
}