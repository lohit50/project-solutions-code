class Solution {
    public int myAtoi(String s) {
        s = s.replaceFirst("^\\s+","");
        long num = 0;
        int index  = 0;
        int sign = +1;

        if(index < s.length() && ( s.charAt(index) == '-' || s.charAt(index) == '+' )){
            sign = (s.charAt(index) == '+') ? +1 : -1;
            index++;
        }
        while(index < s.length() && Character.isDigit(s.charAt(index))){
            num = num * 10 + (s.charAt(index++) - '0');
            if(sign * num  > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign * num  < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }

        return (int) (sign * num);
    }
}