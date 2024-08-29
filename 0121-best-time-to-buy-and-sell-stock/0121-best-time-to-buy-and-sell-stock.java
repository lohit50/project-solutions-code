class Solution {
    public int maxProfit(int[] arr) {
        int max_profit = 0;
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }else if(arr[i] - min > max_profit){
                    max_profit = arr[i] - min;
                }
            }
        return max_profit;
    }
}