class Solution {
    public int findComplement(int num) {
        String Strbin = Integer.toBinaryString(num);
        String comply = Strbin.replace("0","*");
        comply = comply.replace("1","0");
        comply = comply.replace("*","1");
        int number = Integer.parseInt(comply, 2);
        return number;
    }
}