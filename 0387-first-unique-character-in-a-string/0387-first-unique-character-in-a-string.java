class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char letter : s.toCharArray()){
            if(map.containsKey(letter)){
                map.put(letter, map.get(letter) + 1);
            }else{
                map.put(letter,1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}