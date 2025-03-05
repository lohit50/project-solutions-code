class Solution {
    public boolean checkValid(int[][] matrix) {
        return check(matrix,0,true) && check(matrix,0,false);
    }
    public static boolean check(int[][] matrix, int row, boolean way){
        if(row == matrix.length) return true;
        int sum = 0;
        if(way){
            int integer = matrix[row][0];
            for(int i = 0; i < matrix.length; i++){
                sum+= matrix[row][i];
                if(i != 0 && matrix[row][i] == integer) return false;
            }
        }
        else{
            for(int i = 0; i < matrix.length; i++) sum+= matrix[i][row];
        }
        if(sum !=  (matrix.length * (matrix.length + 1)) / 2) return false;
        return check(matrix,row+1,way);
    }
}