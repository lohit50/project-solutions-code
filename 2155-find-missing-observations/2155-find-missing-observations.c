int* missingRolls(int* rolls, int size, int mean, int n, int* returnSize) {
    int totalDiv = n + size;
    int crnt_sum = 0;

    for (int i = 0; i < size; i++) {
        crnt_sum += rolls[i];
    }

    int target_sum = totalDiv * mean;
    int combination = target_sum - crnt_sum;

    if (combination < n || combination > 6 * n) {
        *returnSize = 0;
        return NULL;
    }

    int* result = (int*)malloc(n * sizeof(int));

    int individual = combination / n;
    int needed = combination - (individual * n);

    for (int i = 0; i < n; i++) {
        result[i] = individual;
    }

    for (int i = n - 1; i >= 0 && needed > 0; i--) {
    if (result[i] < 6) {
        int add;
        if (result[i] + needed <= 6) {
            add = needed;
        } else {
            add = 6 - result[i];
        }
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
