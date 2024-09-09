class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        // 1....
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],0);
        // }

        // 2......
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
                if(map.get(nums[i]) > 1) res.add(nums[i]);
            }else{
                map.put(nums[i],1);
            }
        }

        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        
        //     if(map.get(nums[i]) > 1){
        //         res.add(nums[i]);
        //     }
        // }
        return res;
    }
}