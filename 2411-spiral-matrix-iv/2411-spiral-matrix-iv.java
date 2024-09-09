/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    private void fillMatrix(int[][] matrix, int remainingRows, int remainingCols, int currentRow, int currentCol, int rowDirection, int colDirection, ListNode currentNode) {
        if (remainingRows == 0 || remainingCols == 0 || currentNode == null) return;

        for (int i = 1; i <= remainingCols; i++) {
            if (currentNode == null) return;  // Stop if the linked list is exhausted
            currentRow += rowDirection;
            currentCol += colDirection;
            matrix[currentRow][currentCol] = currentNode.val;
            currentNode = currentNode.next;  // Move to the next node in the linked list
        }

        // Continue filling the next part of the matrix by alternating directions
        fillMatrix(matrix, remainingCols, remainingRows - 1, currentRow, currentCol, colDirection, -rowDirection, currentNode);
    }

    public int[][] spiralMatrix(int totalRows, int totalCols, ListNode head) {
        int[][] matrix = new int[totalRows][totalCols];
        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                matrix[i][j] = -1;
            }
        }

        // Start filling the matrix from position (0, -1) and initially move to the right
        fillMatrix(matrix, totalRows, totalCols, 0, -1, 0, 1, head);

        return matrix;
    }
}
