int divide(int dividend, int divisor) {
    // Handle the overflow case where the result exceeds the 32-bit signed integer range
    if (dividend == INT_MIN && divisor == -1) {
        return INT_MAX; // Return 2147483647 to avoid overflow
    }
    return dividend / divisor;
}
