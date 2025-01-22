class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = 23345678;
        for(int i : prices){
            if(i < min) min = i;
            else if(i - min > profit) profit = i - min;
        }
        return profit;
    }
}