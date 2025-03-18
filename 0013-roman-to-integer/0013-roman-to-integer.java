class Solution {
    public int romanToInt(String s) {
        Map<String,Integer> map = new HashMap();
        map.put("I",1);
        map.put("V",5);
        map.put("IV",4);
        map.put("X",10);
        map.put("IX",9);
        map.put("XL",40);
        map.put("L",50);
        map.put("XC",90);
        map.put("C",100);
        map.put("CD",400);
        map.put("D",500);
        map.put("CM",900);
        map.put("M",1000);
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            String pull;
            if(s.charAt(i) == 'X'){
                if(i < s.length() - 1 && s.charAt(i+1) == 'L') pull = "XL";
                else if(i < s.length() - 1 && s.charAt(i+1) == 'C') pull = "XC";
                else pull = "X";
            }
            else if(s.charAt(i) == 'C'){
                if(i < s.length() - 1 && s.charAt(i+1) == 'M') pull = "CM";
                else if(i < s.length() - 1 && s.charAt(i+1) == 'D') pull = "CD";
                else pull = "C";
            }
            else if(s.charAt(i) == 'I'){
                if(i < s.length() - 1 && s.charAt(i+1) == 'V') pull = "IV";
                else if(i < s.length() - 1 && s.charAt(i+1) == 'X') pull = "IX";
                else pull = "I";
            }
            else {
                pull = Character.toString(s.charAt(i));
            }
            result += map.get(pull);
            if(pull.length() == 2) i++;
        }
        return result;
    }
}