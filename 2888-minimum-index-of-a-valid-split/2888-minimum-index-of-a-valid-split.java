class Solution {
    public int minimumIndex(List<Integer> nums) {
        
        Map<Integer,Integer> map = new HashMap<>();

        // fnd dom
        int dominant = -1;
        int freq = 0;
        for(int i = 0 ; i < nums.size(); i++){
            map.put(nums.get(i), map.getOrDefault(nums.get(i) , 0) + 1);
            if(map.get(nums.get(i)) > freq){
                freq = map.get(nums.get(i));
                dominant = nums.get(i);
            }
        }
        // System.out.println(dominant);

        // fnd dom validity 
        int count = 0;
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) == dominant){
                count++;
            }
            if(count * 2 > (i+1)){
                int rightremain = freq - count;
                int rightlength = nums.size() - (i+1);
                if(rightremain * 2 > rightlength) return i;
            }
        }
        // System.out.println(map);
        return -1;
    }
}