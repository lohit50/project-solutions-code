class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char letter : s.toCharArray()){
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
