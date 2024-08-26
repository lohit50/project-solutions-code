int* majorityElement(int* arr, int n, int* returnSize) {
    int* result = (int*)malloc(2 * sizeof(int)); 
    int count1 = 0, count2 = 0, candidate1 = 0, candidate2 = 0;

    for (int i = 0; i < n; i++) {
        if (candidate1 == arr[i]) {
            count1++;
        } else if (candidate2 == arr[i]) {
            count2++;
        } else if (count1 == 0) {
            candidate1 = arr[i];
            count1 = 1;
        } else if (count2 == 0) {
            candidate2 = arr[i];
            count2 = 1;
        } else {
            count1--;
            count2--;
        }
    }

    count1 = count2 = 0;
    for (int i = 0; i < n; i++) {
        if (arr[i] == candidate1) {
            count1++;
        } else if (arr[i] == candidate2) {
            count2++;
        }
    }

    *returnSize = 0;
    if (count1 > n / 3) {
        result[(*returnSize)++] = candidate1;
    }
    if (count2 > n / 3) {
        result[(*returnSize)++] = candidate2;
    }

    return result;
}