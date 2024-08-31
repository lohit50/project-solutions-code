void expandAroundCenter(char *s, int left, int right, int *start, int *maxLen) {
    int len = strlen(s);
    while (left >= 0 && right < len && s[left] == s[right]) {
        if (right - left + 1 > *maxLen) {
            *start = left;
            *maxLen = right - left + 1;
        }
        left--;
        right++;
    }
}

char* longestPalindrome(char* s) {
    int len = strlen(s);
    int start = 0;
    int maxLen = 1;

    for (int i = 0; i < len; i++) {
        expandAroundCenter(s, i, i, &start, &maxLen);
        expandAroundCenter(s, i, i + 1, &start, &maxLen);
    }

    char* result = (char*)malloc((maxLen + 1) * sizeof(char));
    strncpy(result, s + start, maxLen);
    result[maxLen] = '\0';

    return result;
}