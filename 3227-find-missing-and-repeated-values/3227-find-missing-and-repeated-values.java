class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] map = new int[grid.length * grid.length + 1 + 1];
        map[map.length - 1] = (grid.length * grid.length * (grid.length * grid.length + 1 )) / 2;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                if(map[grid[i][j]] == 1) grid[0][0] = grid[i][j];
                else{
                    map[map.length - 1] -= grid[i][j];
                    map[grid[i][j]] = 1;
                }
            }
        }
        return new int[]{grid[0][0],map[map.length - 1]};
    }
}