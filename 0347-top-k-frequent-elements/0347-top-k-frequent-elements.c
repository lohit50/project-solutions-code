#include <stdlib.h>
#include <limits.h>

int* topKFrequent(int* nums, int n, int k, int* returnSize) {
    if (n == 0 || k == 0) {
        *returnSize = 0;
    
    }

    int min_val = INT_MAX;
    int max_val = INT_MIN;
    
    for (int i = 0; i < n; i++) {
        if (nums[i] < min_val) min_val = nums[i];
        if (nums[i] > max_val) max_val = nums[i];
    }

    int range = max_val - min_val + 1;
    int offset = -min_val; 

    int* freq = (int*)malloc(range * sizeof(int));
    for (int i = 0; i < range; i++) freq[i] = 0;

    for (int i = 0; i < n; i++) freq[nums[i] + offset]++;

    int* result_1 = (int*)malloc(k * sizeof(int));
    for (int i = 0; i < k; i++) {
        int maxval = -1;
        int max_index = -1;

        for (int j = 0; j < range; j++) {
            if (freq[j] > maxval) {
                maxval = freq[j];
                max_index = j;
            }
        }

        result_1[i] = max_index - offset;
        freq[max_index] = -1;
    }

    *returnSize = k;
    free(freq);
    return result_1;
}
