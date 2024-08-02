bool isPalindrome(int x) {
    // Negative numbers are not palindromes
    if (x < 0) return false;

    // Variables to store the original number and the reversed number
    int original = x;
    long long reversed = 0;

    // Reverse the number
    while (x != 0) {
        reversed = reversed * 10 + x % 10;
        x /= 10;
    }

    // Check if the original number is equal to the reversed number
    return original == reversed;
}
