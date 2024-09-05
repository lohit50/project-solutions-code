int* missingRolls(int* rolls, int size, int mean, int n, int* returnSize) {
    int totalDiv = n + size;
    int crnt_sum = 0;

    // Calculate the current sum of the existing rolls
    for (int i = 0; i < size; i++) {
        crnt_sum += rolls[i];
    }

    // Calculate the target sum of all rolls
    int target_sum = totalDiv * mean;
    int combination = target_sum - crnt_sum;

    // Check if the combination is feasible
    if (combination < n || combination > 6 * n) {
        *returnSize = 0;
        return NULL;
    }

    // Allocate memory for the result array
    int* result = (int*)malloc(n * sizeof(int));

    // Determine the base value and initialize the result array
    int individual = combination / n;
    int needed = combination - (individual * n);

    // Fill the result array with the base value
    for (int i = 0; i < n; i++) {
        result[i] = individual;
    }

    for (int i = n - 1; i >= 0 && needed > 0; i--) {
        if (result[i] < 6) {
            int add = (result[i] + needed <= 6) ? needed : (6 - result[i]);
            result[i] += add;
            needed -= add;
        }
    }

    if (needed > 0) {
        *returnSize = 0;
        free(result);
        return NULL;
    }

    *returnSize = n;
    return result;
}
