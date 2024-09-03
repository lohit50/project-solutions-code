int minDistance(char* word1, char* word2) {
    int m = strlen(word1);
    int n = strlen(word2);
    
    int dp[m+1][n+1];
    
    for (int i = 0; i <= m; i++) {
        dp[i][0] = i; 
    }
    for (int j = 0; j <= n; j++) {
        dp[0][j] = j;
    }
    
    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            int cost = (word1[i - 1] == word2[j - 1]) ? 0 : 1;
            dp[i][j] = fmin(
                fmin(dp[i - 1][j] + 1,    // Deletion
                     dp[i][j - 1] + 1),   // Insertion
                dp[i - 1][j - 1] + cost); // Substitution
        }
    }
    
    int result = dp[m][n];
    return result;
}
