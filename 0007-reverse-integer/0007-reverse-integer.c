#include <limits.h>

int reverse(int x) {
    int result = 0;
    while (x != 0) {        
        int digit = x % 10;

        // Check for overflow before multiplying by 10 and adding the digit
        if (result > INT_MAX / 10 || (result == INT_MAX / 10 && digit > 7)) {
            return 0; // Positive overflow
        }
        if (result < INT_MIN / 10 || (result == INT_MIN / 10 && digit < -8)) {
            return 0; // Negative overflow
        }

        result = result * 10 + digit;
        x /= 10;
    }

    return result;
}
