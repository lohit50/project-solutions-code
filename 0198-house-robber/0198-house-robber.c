int rob(int* arr, int n) {
    if (n == 0) return 0;        // No houses to rob
    if (n == 1) return arr[0];   // Only one house to rob

    int prev2 = 0;  // Maximum money that can be robbed from all previous houses except the last one
    int prev1 = arr[0];  // Maximum money that can be robbed up to the first house

    for (int i = 1; i < n; i++) {
        int current = arr[i];
        int newMax = (prev2 + current > prev1) ? (prev2 + current) : prev1;
        prev2 = prev1;
        prev1 = newMax;
    }

    return prev1;  // The maximum money that can be robbed without alerting the police
}
