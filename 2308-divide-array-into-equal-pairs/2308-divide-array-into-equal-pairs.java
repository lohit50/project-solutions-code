// class Solution {
//     public boolean divideArray(int[] nums) {
//         HashMap<Integer, Integer> frequency = new HashMap<>();
//         for(int num : nums){
//             frequency.put(num , frequency.getOrDefault(num, 0) + 1);
//         }
//         for(int num : nums){
//             if(frequency.get(num) % 2 != 0) return false;
//         }
//         return true;
//     }
// }

class Solution {
    public boolean divideArray(int[] nums) {
        int[] frequency = new int[501];
        for(int i = 0; i < nums.length; i++) frequency[nums[i]]++;
        for(int i = 0; i < frequency.length; i++) if(frequency[i] % 2 != 0) return false;
        return true;
    }
}