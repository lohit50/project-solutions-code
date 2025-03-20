class Solution {
    public int strStr(String h, String n){

        List<Integer> list = new ArrayList();
        for(int i = 0; i < h.length(); i++){
            if(h.charAt(i) == n.charAt(0)) list.add(i);
        }

        int i = 0;
        while(list.size() > 0){
            i = list.get(0);
            int j = 0;
            while(j < n.length() && i < h.length() && h.charAt(i) == n.charAt(j)){
                i++;
                j++;
            }
            if(j == n.length()) return i - j; 
            list.remove(0);
        }

        return -1;
    }
}