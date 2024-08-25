
int lengthOfLastWord(char* arr) {
    int count = 0;
    int n = 0;

    // Find the length of the string while traversing
    while (arr[n] != '\0') {
        n++;
    }

    // Traverse from the end to count the last word
    for (int i = n - 1; i >= 0; i--) {
        if (isalpha(arr[i])) {
            count++;
        } else if (count > 0) {
            break;
        }
    }

    return count;
}
