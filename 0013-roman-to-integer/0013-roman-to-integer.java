class Solution {
    public int romanToInt(String s) {
        int roman[] = new int[89];
        roman['I'] = 1;
        roman['V'] = 5;
        roman['X'] = 10;
        roman['L'] = 50;
        roman['C'] = 100;
        roman['D'] = 500;
        roman['M'] = 1000;

        int total = 0;

        for(int i = 0; i + 1 < s.length(); i++){
            if(roman[s.charAt(i)] < roman[s.charAt(i+1)]){
                total -= roman[s.charAt(i)];
            }
            else{
                total += roman[s.charAt(i)];
            }
        }
        return total + roman[s.charAt(s.length() - 1)];
    }
}