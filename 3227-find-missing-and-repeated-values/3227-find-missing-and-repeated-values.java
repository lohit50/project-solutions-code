class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int real_sum = (grid.length * grid.length * (grid.length * grid.length + 1 )) / 2;
        Set<Integer> set = new HashSet();
        int crnt_sum = 0;
        int[] result = new int[2];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                crnt_sum += grid[i][j];
                if(!set.add(grid[i][j])){
                    result[0] = grid[i][j];
                    crnt_sum -= grid[i][j];
                }
            }
        }
        result[1] = real_sum - crnt_sum;
        return result;
    }
}