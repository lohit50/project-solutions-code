#include <ctype.h>
#include <string.h>

int lengthOfLastWord(char* arr) {
    int n = strlen(arr); 
    int count = 0;
    
    for (int i = n - 1; i >= 0; i--) {
        if (isalpha(arr[i])) {
            count++;
        }
        else if (count > 0) {
            break;
        }
    }
    return count;
}
