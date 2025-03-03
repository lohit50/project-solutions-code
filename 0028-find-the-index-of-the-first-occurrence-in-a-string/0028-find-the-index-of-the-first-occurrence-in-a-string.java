class Solution {
    public int strStr(String haystack, String needle) {
        int result = -1;
        for(int i = 0; i < haystack.length(); i++){
            int start = haystack.indexOf(needle.charAt(0),i);
            int index = 0;
            while(start >= 0 && index < needle.length() && index + i < haystack.length()){
                if(haystack.charAt(i + index) == needle.charAt(index)){
                    if(index == needle.length() - 1) return i;
                }else break;
                index++;
            }

        }
        return result;
    }
}