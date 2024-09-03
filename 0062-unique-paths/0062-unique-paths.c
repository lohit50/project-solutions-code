long long uniquePaths(int m, int n) {
    int N = m + n - 2;  // Total number of steps the robot needs to take
    int k = m - 1;  // Choose the smaller of (m-1) and (n-1) to optimize the calculation
    if (k > N - k) k = N - k;  // Since C(N, k) == C(N, N-k)
    
    long long res = 1;
    
    for (int i = 1; i <= k; i++) {
        res = res * (N - i + 1) / i;
    }
    
    return res;
}
