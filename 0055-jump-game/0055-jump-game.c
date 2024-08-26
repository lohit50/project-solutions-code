bool canJump(int* arr, int n) {
    int maxReach = 0;
    for (int jumped = 0; jumped < n; jumped++) {
        if (jumped > maxReach) {
            return false;  // If jumped index is beyond maxReach, it's not possible to proceed.
        }
        maxReach = (jumped + arr[jumped] > maxReach) ? jumped + arr[jumped] : maxReach;
        if (maxReach >= n - 1) {
            return true;  // If maxReach reaches or exceeds the last index, return true.
        }
    }
    return false;
}
