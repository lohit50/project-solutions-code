class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList();

        // setting boundaries : 
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int remain = matrix[0].length * matrix.length;
        while(remain > 0){

            // top row filling : 
           for(int i = left; i <= right ; i++){
                list.add(matrix[top][i]);
                remain--;
           }
           top++;

            // right row filling :
            for(int i = top; i <= bottom; i++){
                list.add(matrix[i][right]);
                remain--;
            }
            right--;


            // bottom row filling :
            for(int i = right; i >= left; i--){
                if(remain <= 0) break;
                list.add(matrix[bottom][i]);
                remain--;
            }
            bottom--;
            
            // left row filling :
            for(int i = bottom ; i >= top ; i--){
                if(remain <= 0) break;
                list.add(matrix[i][left]);
                remain--;
            }
            left++;
        }

        return list;
    }
}