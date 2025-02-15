class Solution {
    public boolean canPartition(String sqr_str, int index, int target) {
        if (index == sqr_str.length()) {
            return target == 0;
        }
        
        int sum = 0;
        for (int i = index; i < sqr_str.length(); i++) {
            sum = sum * 10 + (sqr_str.charAt(i) - '0');
            if (sum > target) continue;  // Don't break! Just continue checking.
            if (canPartition(sqr_str, i + 1, target - sum)) return true;
        }
        
        return false;
    }

    public int punishmentNumber(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            String sqr_str = Integer.toString(i * i);
            if (canPartition(sqr_str, 0, i)) {
                result += i * i;
            }
        }
        return result;
    }
}
