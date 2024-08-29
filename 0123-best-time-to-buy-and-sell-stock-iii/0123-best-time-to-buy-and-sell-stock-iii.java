class Solution {
    public int maxProfit(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }

        int maxProfit1 = 0;
        int maxProfit2 = 0;
        int minPrice1 = arr[0];
        int minPrice2 = arr[1];

        for (int i = 1; i < arr.length; i++) {
            minPrice1 = Math.min(minPrice1, arr[i]);
            maxProfit1 = Math.max(maxProfit1, arr[i] - minPrice1);
            minPrice2 = Math.min(minPrice2, arr[i] - maxProfit1);
            maxProfit2 = Math.max(maxProfit2, arr[i] - minPrice2);
        }

        return maxProfit2;
    }
}