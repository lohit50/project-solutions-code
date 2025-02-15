class Solution {

    public int DigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public int maximumSum(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int result = -1;

        for (int num : nums) {
            int digitsum = DigitSum(num);
            if (map.containsKey(digitsum)) {
                result = Math.max(result, map.get(digitsum) + num);
            }
            if (map.getOrDefault(digitsum, 0) < num) {
                map.put(digitsum, num);
            }
        }

        return result;
    }
}