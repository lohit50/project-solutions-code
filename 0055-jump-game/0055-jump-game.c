bool canJump(int* arr, int n) {
    int maxReach = 0;
    for (int jumped = 0; jumped < n; jumped++) {
        if (jumped > maxReach) {
            return false;  
        }
        maxReach = jumped + arr[jumped];
        if (maxReach >= n - 1) {
            return true; 
        }
    }
    return false;
}
