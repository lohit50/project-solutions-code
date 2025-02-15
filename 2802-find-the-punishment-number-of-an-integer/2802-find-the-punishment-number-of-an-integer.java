class Solution {
    public boolean summed(int num, String sqr_str, int index, int target) {
        if (index == sqr_str.length()) {
            return target == 0;
        }
        
        int sum = 0;
        for (int i = index; i < sqr_str.length(); i++) {
            sum = sum * 10 + (sqr_str.charAt(i) - '0');
            if (sum > target) break; // Stop early if sum exceeds target
            if (summed(num, sqr_str, i + 1, target - sum)) return true;
        }
        
        return false;
    }
    
    public int punishmentNumber(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            String sqr_str = Integer.toString(i * i);
            if (summed(i, sqr_str, 0, i)) {
                result += i * i;
            }
        }
        return result;
    }
}
