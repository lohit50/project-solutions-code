class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int []ans=new int[2];
        int n=grid.length;
        int N=n*n;
        int sum = N * (N + 1) / 2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
               if(map.containsKey(grid[i][j])) ans[0] = grid[i][j];
               else{
                map.put(grid[i][j],1);
                sum -= grid[i][j];
               }
            }
        }
        ans[1] = sum;
        return ans;
    }
}