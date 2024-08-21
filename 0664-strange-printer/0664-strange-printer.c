int strangePrinter(char* s) {
    int n = strlen(s);
    int dp[n][n];
    
    for (int i = 0; i < n; i++) {
        dp[i][i] = 1; 
    }
    
    for (int len = 2; len <= n; len++) { 
        for (int i = 0; i <= n - len; i++) {
            int j = i + len - 1;
            dp[i][j] = len;
            
            for (int k = i; k < j; k++) {
                int temp = dp[i][k] + dp[k+1][j];
                if (s[i] == s[j]) {
                    temp--; 
                }
                dp[i][j] = fmin(dp[i][j], temp);
            }
        }
    }
    
    return dp[0][n-1];
}
