class Solution {
    public boolean isValid(String s) {
        int last_length = -1;
        while(last_length != s.length()){
            last_length = s.length();
            s = s.replace("()","").replace("{}","").replace("[]","");
        }
        return s.isEmpty();
    }
}