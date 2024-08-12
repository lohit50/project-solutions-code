#include <stdlib.h>

int compare(const void* a, const void* b) {
    int* pairA = *(int**)a;
    int* pairB = *(int**)b;
    
    if (pairA[1] == pairB[1]) {
        return pairB[0] - pairA[0]; // Sort by value in descending order
    }
    return pairA[1] - pairB[1]; // Sort by frequency in ascending order
}

int* frequencySort(int* nums, int numsSize, int* returnSize) {
    int cnt[numsSize][2];
    for (int i = 0; i < numsSize; i++) {
        cnt[i][0] = 0;
        cnt[i][1] = 0;
    }

    for (int i = 0; i < numsSize; i++) {
        int temp = nums[i];
        int count = 0;
        if (nums[i] > -999) {
            for (int j = i; j < numsSize; j++) {
                if (nums[j] == temp) {
                    count++;
                    nums[j] = -999;
                }
            }
            cnt[i][0] = temp;
            cnt[i][1] = count;
        }
    }

    int* pairs[numsSize];
    int pairsSize = 0;
    for (int i = 0; i < numsSize; i++) {
        if (cnt[i][1] > 0) {
            pairs[pairsSize++] = cnt[i];
        }
    }

    qsort(pairs, pairsSize, sizeof(int*), compare);

    int* sortedArray = (int*)malloc(numsSize * sizeof(int));
    int index = 0;
    for (int i = 0; i < pairsSize; i++) {
        for (int j = 0; j < pairs[i][1]; j++) {
            sortedArray[index++] = pairs[i][0];
        }
    }

    *returnSize = numsSize;
    return sortedArray;
}
