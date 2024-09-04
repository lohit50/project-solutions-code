int uniquePathsWithObstacles(int** grid, int n, int* m) {
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < *m; j++) {
            if (grid[i][j] == 1) grid[i][j] = 0;
            else if (i == 0) grid[i][j] = (j == 0 ? 1 : grid[i][j-1]);
            else if (j == 0) grid[i][j] = grid[i-1][j];
            else grid[i][j] = grid[i-1][j] + grid[i][j-1];
        }
    }
    return grid[n-1][*m-1];
}
