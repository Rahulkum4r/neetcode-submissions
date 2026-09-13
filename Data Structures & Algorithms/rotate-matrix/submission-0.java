class Solution {
    private void swap(int[][]matrix , int row1 , int col1 , int row2 , int col2 ){

        int temp = matrix[row1][col1];
        matrix[row1][col1] = matrix[row2][col2];
        matrix[row2][col2] = temp;
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0 ; i<n ; i++){
            for(int j = i+1 ; j<n ; j++){
                swap(matrix , i , j  , j , i);
            }
        }

        for(int i = 0 ; i<n ; i++){
            int startcol = 0 ;
            int endcol = n-1 ;

            while(startcol < endcol){
                swap(matrix , i ,  startcol , i , endcol);
                startcol++;
                endcol--;
            }
        }
    }
}
