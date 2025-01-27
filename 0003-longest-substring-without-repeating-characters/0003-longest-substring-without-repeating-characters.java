class Solution {
    public int lengthOfLongestSubstring(String str) {
        char[] s = str.toCharArray();
        int max_length = 0;
        int[] arr = new int[128];
        int left = 0;
        int right = 0;

        while (right < s.length) {
            arr[s[right]]++;
            while (arr[s[right]] > 1) {
                arr[s[left]]--;
                left++;
            }
            max_length = Math.max(max_length, right - left + 1);
            right++;
        }

        return max_length;
    }
}
