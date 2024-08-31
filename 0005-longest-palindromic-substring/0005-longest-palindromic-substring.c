char* longestPalindrome(char* s) {
    int len = strlen(s), start = 0, maxlen = 1;
    for (int i = 0; i < len; i++) {
        for (int j = 0; j < 2; j++) {
            int left = i, right = i + j;
            while (left >= 0 && right < len && s[left] == s[right]) {
                if (right - left + 1 > maxlen) {
                    start = left;
                    maxlen = right - left + 1;
                }
                left--;
                right++;
            }
        }
    }
    char* result = (char*)malloc((maxlen + 1) * sizeof(char));
    strncpy(result, s + start, maxlen);
    result[maxlen] = '\0';
    return result;
}
