#include <stdbool.h>

bool canJump(int* arr, int n) {
    int maxReach = 0;
    for (int i = 0; i < n; i++) {
        if (i > maxReach) {
            return false;
        }
        if (maxReach < i + arr[i]) {
            maxReach = i + arr[i];
        }
    }
    return maxReach >= n - 1;
}
