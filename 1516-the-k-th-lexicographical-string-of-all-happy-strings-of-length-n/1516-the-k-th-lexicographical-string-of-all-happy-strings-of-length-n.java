
class Solution {
    public String getHappyString(int n, int k) {
        int total = 1 << (n - 1); 
        if (k > 3 * total) return ""; 
        
        StringBuilder sb = new StringBuilder();
        char prev = (char) ('a' + (k - 1) / total); 
        sb.append(prev);
        
        k = (k - 1) % total; 
        
        for (int i = 1; i < n; i++) {
            total /= 2; 
            char first = prev == 'a' ? 'b' : 'a'; 
            char second = (char) ('a' + 'b' + 'c' - first - prev);
            prev = (k / total == 0) ? first : second;
            sb.append(prev);
            k %= total;
        }
        
        return sb.toString();
    }
}
