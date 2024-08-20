class Solution {
    public int climbStairs(int num) {
        int present = 1;
        int prev = 1;
        int next;
        for(int i=1;i<num;i++){
            next = present + prev;
            prev = present;
            present = next;
        }
        return present;
    }
}