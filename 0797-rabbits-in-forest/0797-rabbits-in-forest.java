class Solution {
    public int numRabbits(int[] nums){
        HashMap<Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }
        int count = 0;
        // System.out.print(map);
        for(Map.Entry<Integer, Integer> i : map.entrySet()){
            count += ((i.getValue() + i.getKey()) / (1 + i.getKey())) * (i.getKey() + 1);
        }
        return count;
    }
}