int gcd(int a, int b) {
    while (b) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

// Function to handle fraction addition and subtraction
char* fractionAddition(char* expression) {
    int numerator = 0, denominator = 1;
    int num = 0, denom = 0, sign = 1;
    int i = 0;
    while (expression[i] != '\0') {
        if (expression[i] == '-' || expression[i] == '+') {
            sign = (expression[i] == '-') ? -1 : 1;
            i++;
        }
        
        // Parse the numerator
        num = 0;
        while (expression[i] != '/') {
            num = num * 10 + (expression[i] - '0');
            i++;
        }
        num *= sign;
        i++; // Skip the '/'
        
        // Parse the denominator
        denom = 0;
        while (i < strlen(expression) && expression[i] >= '0' && expression[i] <= '9') {
            denom = denom * 10 + (expression[i] - '0');
            i++;
        }
        
        // Compute the result with the current fraction
        numerator = numerator * denom + num * denominator;
        denominator *= denom;
        
        // Simplify the fraction
        int commonDivisor = gcd(abs(numerator), denominator);
        numerator /= commonDivisor;
        denominator /= commonDivisor;
    }

    char* result = (char*)malloc(32);
    sprintf(result, "%d/%d", numerator, denominator);
    return result;
}