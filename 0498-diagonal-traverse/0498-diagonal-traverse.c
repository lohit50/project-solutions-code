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
        // If the sum of row and column indices is even, move upwards
        if ((r + c) % 2 == 0) {
            if (c == n - 1) { // Last column
                r++;
            } else if (r == 0) { // First row
                c++;
            } else { // Move up diagonally
                r--;
                c++;
            }
        } else { // Move downwards
            if (r == m - 1) { // Last row
                c++;
            } else if (c == 0) { // First column
                r++;
            } else { // Move down diagonally
                r++;
                c--;
            }
        }
    }
    return result;
}
