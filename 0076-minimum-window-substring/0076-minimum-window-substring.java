class Solution {
    public String minWindow(String s, String t) {
        if (s.equals(t)) return t;
        if (s.length() < t.length()) return "";

        // Frequency map for characters in t
        int[] map = new int[128];
        for (char c : t.toCharArray()) {
            map[c]++;
        }

        int start = 0; // Start of the minimum window
        int minLen = Integer.MAX_VALUE; // Length of the minimum window
        int minStart = 0; // Start index of the minimum window
        int count = t.length(); // Number of characters to match

        int l = 0; // Left pointer
        int r = 0; // Right pointer

        while (r < s.length()) {
            char c = s.charAt(r);
            if (map[c] > 0) {
                count--;
            }
            map[c]--; 
            r++;

            while (count == 0) {
                if (r - l < minLen) {
                    minLen = r - l;
                    minStart = l;
                }

                char leftChar = s.charAt(l);
                map[leftChar]++;
                if (map[leftChar] > 0) {
                    count++;
                }
                l++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}