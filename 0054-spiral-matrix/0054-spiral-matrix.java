class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList();

        // setting boundaries : 
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(left <= right && top <= bottom){

            // top row filling : 
           for(int i = left; i <= right ; i++){
             list.add(matrix[top][i]);
           }
           top++;

            // right row filling :
            for(int i = top; i <= bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;


            // bottom row filling :
            if(top <= bottom){
            for(int i = right; i >= left; i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;
            }
            
            // left row filling :
            if(left <= right){
            for(int i = bottom ; i >= top ; i--){
                list.add(matrix[i][left]);
            }
            left++;
            }
        }

        return list;
    }
}