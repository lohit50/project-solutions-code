int* plusOne(int* arr, int n, int* returnSize) {
    int carry = 1;
    int *result;
    *returnSize = n;
    result = (int*) malloc((*returnSize) * sizeof(int));

    if (result == NULL) {
        exit(1);
    }

    for (int i = n - 1; i >= 0; i--) {
        int sum = arr[i] + carry;
        if (sum == 10) {
            result[i] = 0;
        } else {
            result[i] = sum;
            carry = 0;
        }
    }

    if (carry == 1) {
        *returnSize = n + 1;
        result = (int*) realloc(result, (*returnSize) * sizeof(int));
        if (result == NULL) {
            exit(1);
        }
        for (int i = n; i > 0; i--) {
            result[i] = result[i - 1];
        }
        result[0] = 1;
    }

    return result;
}
