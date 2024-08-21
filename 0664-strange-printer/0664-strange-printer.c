int strangePrinter(char* s) {
    int n = strlen(s);
    int dp[n][n];
    
    // Initialize the DP array
    for (int i = 0; i < n; i++) {
        dp[i][i] = 1; // A single character requires only 1 print
    }
    
    // Fill the DP table
    for (int len = 2; len <= n; len++) { // len is the length of the current substring
        for (int i = 0; i <= n - len; i++) {
            int j = i + len - 1;
            dp[i][j] = len; // Maximum number of prints needed initially
            
            for (int k = i; k < j; k++) {
                int temp = dp[i][k] + dp[k+1][j];
                if (s[i] == s[j]) {
                    temp--; // If the characters at the two ends are the same, reduce by 1
                }
                dp[i][j] = fmin(dp[i][j], temp);
            }
        }
    }
    
    return dp[0][n-1];
}
