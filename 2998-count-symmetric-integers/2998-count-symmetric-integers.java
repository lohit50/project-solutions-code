class Solution {
    private int count;
    public boolean Check(int num){
        if(Math.floor(Math.log10(num) + 1) % 2 != 0) return false;
        String number = Integer.toString(num);
        int start = 0;
        int end = number.length() - 1;
        int left = 0;
        int right = 0;
        while(start < end){
            left += number.charAt(start) - '0';
            right += number.charAt(end) - '0';
            start++;
            end--;
        }
        if(left == right) return true;
        return false;
    }
    public int countSymmetricIntegers(int low, int high) {
        for(int i = low; i<= high; i++){
            if(Check(i)){
                count++;
                i+=8;
            }
        }
        return count;
    }
}