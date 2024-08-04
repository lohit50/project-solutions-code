
// Function to find the longest common prefix string amongst an array of strings
char* longestCommonPrefix(char** strs, int strsSize) {
    // If the input array is empty, return an empty string
    if (strsSize == 0) {
        return "";
    }
    
    // Use the first string as the base for comparison
    char* prefix = strs[0];
    int prefixLength = strlen(prefix);
    
    // Iterate through the rest of the strings
    for (int i = 1; i < strsSize; i++) {
        int j = 0;
        // Compare characters until they are the same or until the end of one of the strings is reached
        while (j < prefixLength && j < strlen(strs[i]) && prefix[j] == strs[i][j]) {
            j++;
        }
        // Update the length of the common prefix
        prefixLength = j;
        // If there is no common prefix, return an empty string
        if (prefixLength == 0) {
            return "";
        }
    }
    
    // Create a new string for the result
    char* result = (char*)malloc((prefixLength + 1) * sizeof(char));
    strncpy(result, prefix, prefixLength);
    result[prefixLength] = '\0';
    
    return result;
}