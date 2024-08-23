#include <stdio.h>
#include <stdlib.h>

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findDiagonalOrder(int** mat, int matSize, int* matColSize, int* returnSize) {
    int m = matSize;
    int n = *matColSize;
    int totalElements = m * n;
    int* result = (int*)malloc(totalElements * sizeof(int));
    *returnSize = totalElements;

    int r = 0, c = 0, k = 0;

    for (int i = 0; i < totalElements; i++) {
        result[k++] = mat[r][c];  
       
        if ((r + c) % 2 == 0) {
            if (c == n - 1) { 
                r++;
            } else if (r == 0) { 
                c++;
            } else { 
                r--;
                c++;
            }
        } else {
            if (r == m - 1) { 
                c++;
            } else if (c == 0) {
                r++;
            } else {
                r++;
                c--;
            }
        }
    }
    return result;
}
