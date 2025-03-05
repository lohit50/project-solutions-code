class Solution {
    public long coloredCells(int n) {
        long result = 1;
        int i = 0;
        while(n-- > 0) result += (4*(i++));
        return result;
    }
}