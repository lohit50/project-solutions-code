class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int N = original.length;

        if(N > m * n || N < m * n)
            return new int[][]{};
        
        int[][] arr2d = new int[m][n];

        int k = 0;
        for(int i = 0; i < m ; i++)
            for(int j = 0; j < n; j++)
                arr2d[i][j] = original[k++];

        return arr2d;
    }
}