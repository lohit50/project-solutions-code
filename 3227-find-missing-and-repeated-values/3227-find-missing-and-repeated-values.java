class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int real_sum = (grid.length * grid.length * (grid.length * grid.length + 1 )) / 2;
        Set<Integer> set = new HashSet();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                if(!set.add(grid[i][j])) grid[0][0] = grid[i][j];
                else real_sum -= grid[i][j];
            }
        }
        return new int[]{grid[0][0],real_sum};
    }
}