class Solution {
    private int max = 0;
    public int maximalSquare(char[][] matrix) {
        int max = 0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for(int i = matrix.length - 1; i >=0 ; i--){
            for(int j = matrix[0].length - 1; j >= 0; j--){
                dp[i][j] = matrix[i][j] - '0';
                if(dp[i][j] == 1 && i < matrix.length - 1 && j < matrix[0].length - 1){
                    dp[i][j] += Math.min(dp[i+1][j+1],Math.min(dp[i][j+1],dp[i+1][j]));
                }
                max = Math.max(max,dp[i][j]);
            }
        }
        return max * max;
    }
}