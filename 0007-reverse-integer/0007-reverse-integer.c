#include <limits.h>

int reverse(int x) {
    long result = 0;  // Use a long to handle potential overflow in intermediate steps
    while (x != 0) {
        int pop = x % 10;  // Get the last digit
        x /= 10;  // Remove the last digit from x

        // Check for overflow before updating the result
        if (result > INT_MAX/10 || (result == INT_MAX / 10 && pop > 7)) return 0;
        if (result < INT_MIN/10 || (result == INT_MIN / 10 && pop < -8)) return 0;

        result = result * 10 + pop;
    }

    return (int)result;  // Cast the result back to int
}
