class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashMap <Character,Integer> map = new HashMap<>();
        for(int i=0;i<allowed.length();i++){
            map.put(allowed.charAt(i),1);
        }
        int flag = 1;
        int count = 0;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(!map.containsKey(words[i].charAt(j))){
                    flag = 0;
                }
            }
            if(flag == 1) count++;
            flag = 1;
        }
    return count;    
    }
}