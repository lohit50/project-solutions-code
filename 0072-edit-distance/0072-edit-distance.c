 // Function to find the minimum of three integers
int min(int a, int b, int c) {
    if (a < b) {
        return a < c ? a : c;
    }
    return b < c ? b : c;
}

// Function to find the minimum number of operations required to convert word1 to word2
int minDistance(char* word1, char* word2) {
    int m = strlen(word1);
    int n = strlen(word2);

    // Create a 2D array to store the DP table
    int** dp = (int**)malloc((m + 1) * sizeof(int*));
    for (int i = 0; i <= m; i++) {
        dp[i] = (int*)malloc((n + 1) * sizeof(int));
    }

    // Initialize the DP table
    for (int i = 0; i <= m; i++) {
        dp[i][0] = i; // If word2 is empty, we need i deletions
    }
    for (int j = 0; j <= n; j++) {
        dp[0][j] = j; // If word1 is empty, we need j insertions
    }

    // Fill the DP table
    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if (word1[i - 1] == word2[j - 1]) {
                dp[i][j] = dp[i - 1][j - 1]; // No change needed if characters match
            } else {
                dp[i][j] = min(dp[i - 1][j] + 1,    // Deletion
                               dp[i][j - 1] + 1,    // Insertion
                               dp[i - 1][j - 1] + 1); // Replacement
            }
        }
    }

    // Get the result from the last cell
    int result = dp[m][n];

    // Free allocated memory
    for (int i = 0; i <= m; i++) {
        free(dp[i]);
    }
    free(dp);

    return result;
}

    
