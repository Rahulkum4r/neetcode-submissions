class Solution {

    public void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Indicates whether the first column should be zero
        boolean firstColZero = false;

        // Step 1: Use first row and first column as markers
        for (int i = 0; i < rows; i++) {

            // Check if the first column contains a zero
            if (matrix[i][0] == 0) {
                firstColZero = true;
            }

            // Start from column 1 because column 0 is used as a row marker
            for (int j = 1; j < cols; j++) {

                if (matrix[i][j] == 0) {

                    // Mark the corresponding row
                    matrix[i][0] = 0;

                    // Mark the corresponding column
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 2: Traverse from bottom-right and update the matrix
        for (int i = rows - 1; i >= 0; i--) {

            for (int j = cols - 1; j >= 1; j--) {

                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }

            // Handle the first column separately
            if (firstColZero) {
                matrix[i][0] = 0;
            }
        }
    }
}