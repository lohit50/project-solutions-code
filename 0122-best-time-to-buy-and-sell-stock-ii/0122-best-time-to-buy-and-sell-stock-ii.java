class Solution {
    public int maxProfit(int[] arr) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i=1;i<n;i++){
            min = arr[i-1];
            if(arr[i]-min > 0){
                profit+= arr[i] - min;
            }
        }
        return profit;
    }
}