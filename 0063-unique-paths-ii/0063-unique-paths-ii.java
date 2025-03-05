class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        if(grid[0][0] == 1 ) return 0;
        if(grid[0].length == 1 && grid[0][0] != 0) return 0;
        if(grid[0].length == 0) return 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(i == 0 && j == 0) grid[i][j] = 1;
                else if(grid[i][j] == 1) grid[i][j] = 0;
                else if(i == 0) grid[i][j] = grid[i][j-1];
                else if(j == 0) grid[i][j] = grid[i-1][j];
                else grid[i][j] = grid[i-1][j] + grid[i][j-1];
            }
        System.out.println(Arrays.toString(grid[i]));
        }
        return grid[grid.length - 1][grid[grid.length - 1].length - 1];
    }
}