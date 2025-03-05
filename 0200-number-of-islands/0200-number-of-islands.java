class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    islands ++;
                    bfs(grid,i,j);
                }
            }
        }
        return islands;
    }
    public static void bfs(char[][] grid, int row, int col){
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == '0'){
            return;
        }
        grid[row][col] = '0';
        bfs(grid,row+1,col);
        bfs(grid,row-1,col);
        bfs(grid,row,col+1);
        bfs(grid,row,col-1);
    }
}