int minPathSum(int** grid, int n, int* m) {
    for(int i=0;i<n;i++){
        for(int j=0;j<*m;j++){
            if(i==0 && j==0) continue;
            if(i==0){
                grid[i][j] = grid[i][j] + grid[i][j-1];
            }
            else if(j==0){
                grid[i][j] = grid[i][j] + grid[i-1][j];
            }else if(i>0 && j>0){
                if(grid[i][j-1]>grid[i-1][j]){
                    grid[i][j] = grid[i][j] + grid[i-1][j];
                }else{
                    grid[i][j] = grid[i][j] + grid[i][j-1];
                }
            }
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<*m;j++){
            printf("%d ",grid[i][j]);
        }
        printf("\n");
    }
    return grid[n-1][*m-1];
}