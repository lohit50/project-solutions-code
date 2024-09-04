int minDistance(char* word1, char* word2) {
    int m = strlen(word1);
    int n = strlen(word2);
    
    int dp[m+1][n+1];
    
    for (int i = 0; i <= m; i++) {
        for (int j = 0; j <= n; j++) {
            if (i == 0) {
                dp[i][j] = j; // Initialize the first row
            } else if (j == 0) {
                dp[i][j] = i; // Initialize the first column
            } else {
                int cost = (word1[i - 1] == word2[j - 1]) ? 0 : 1;
                dp[i][j] = fmin(
                    fmin(dp[i - 1][j] + 1,    // Deletion
                         dp[i][j - 1] + 1),   // Insertion
                    dp[i - 1][j - 1] + cost); // Substitution
            }
        }
    }
    
    return dp[m][n];
}
