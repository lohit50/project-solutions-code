class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        int start = haystack.indexOf(needle);  
        return start; 
    }
}