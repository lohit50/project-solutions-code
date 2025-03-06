class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int []ans=new int[2];
        int n=grid.length;
        int N=n*n;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
               map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }for(int i=1;i<=N;i++){
           if(map.containsKey(i) && map.get(i) > 1){
            ans[0]=i;
            }
            if(!map.containsKey(i)){
                ans[1]=i;
            }
        }
        return ans;
    }
}