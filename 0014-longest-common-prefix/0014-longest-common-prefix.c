
char* longestCommonPrefix(char** strs, int strsSize) {
    if (strsSize == 0) {
        return "";
    }
    
    char* prefix = strs[0];
    int prefixLength = strlen(prefix);
    
    for (int i = 1; i < strsSize; i++) {
        int j = 0;
        while (j < prefixLength && j < strlen(strs[i]) && prefix[j] == strs[i][j]) {
            j++;
        }
        prefixLength = j;
        if (prefixLength == 0) {
            return "";
        }
    }
    
    char* result = (char*)malloc((prefixLength + 1) * sizeof(char));
    strncpy(result, prefix, prefixLength);
    result[prefixLength] = '\0';
    
    return result;
}