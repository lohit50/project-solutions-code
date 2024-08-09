

bool wordBreak(char* s, char** wordDict, int wordDictSize) {
    int len = strlen(s);
    bool dp[len + 1];
    
    dp[0] = true;  // Base case: An empty string can be segmented
    
    for (int i = 1; i <= len; i++) {
        dp[i] = false;
        for (int j = 0; j < i; j++) {
            if (dp[j]) {
                // Check if the substring s[j:i] is in wordDict
                for (int k = 0; k < wordDictSize; k++) {
                    if (strncmp(s + j, wordDict[k], i - j) == 0 && strlen(wordDict[k]) == i - j) {
                        dp[i] = true;
                        break;
                    }
                }
            }
            if (dp[i]) break; // No need to check further if we found a match
        }
    }
    
    return dp[len];
}
