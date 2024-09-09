class Solution {

    private void fillMatrix(int[][] matrix, int m, int n, int currentRow, int currentCol, int direction, ListNode currentNode) {
        if (currentNode == null) return;

        matrix[currentRow][currentCol] = currentNode.val;
        currentNode = currentNode.next;

        int nextRow = currentRow, nextCol = currentCol;
        if (direction == 2) nextCol++;     // Move right
        else if (direction == 3) nextRow++; // Move down
        else if (direction == 4) nextCol--; // Move left
        else if (direction == 1) nextRow--; // Move up

        if (nextRow < 0 || nextRow >= m || nextCol < 0 || nextCol >= n || matrix[nextRow][nextCol] != -1) {
            direction = direction % 4 + 1;
            if (direction == 2) { nextRow = currentRow; nextCol = currentCol + 1; }
            else if (direction == 3) { nextRow = currentRow + 1; nextCol = currentCol; } 
            else if (direction == 4) { nextRow = currentRow; nextCol = currentCol - 1; } 
            else if (direction == 1) { nextRow = currentRow - 1; nextCol = currentCol; } 
        }

        if (nextRow >= 0 && nextRow < m && nextCol >= 0 && nextCol < n && matrix[nextRow][nextCol] == -1) {
            fillMatrix(matrix, m, n, nextRow, nextCol, direction, currentNode);
        }
    }

    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = -1;
            }
        }

        fillMatrix(matrix, m, n, 0, 0, 2, head);

        return matrix;
    }
}
