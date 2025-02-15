class Solution {

    public int DigitSum(int num){
        int out = 0;
        while(num > 0){
            out += num%10;
            num /= 10;
        }
        return out;
    }

    public int maximumSum(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int flag = 0;
        int result = -1;

        for(int num : nums){
            int digitsum = DigitSum(num);
            if(map.containsKey(digitsum)){
                result = Math.max(result, map.get(digitsum) + num);
            }
            map.put(digitsum, Math.max(map.getOrDefault(digitsum, 0), num));
        }

        return result;
    }
}