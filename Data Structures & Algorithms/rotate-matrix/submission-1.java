class Solution {
    public void rotate(int[][] matrix) {
       

       int n = matrix.length;

        for(int i =0 ; i<n ; i++){
            for(int j = i+1 ; j<n ; j++){

                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i] =temp;
            }
        }

        for(int rows = 0 ; rows< n ; rows++){

            int startcol = 0 ;
            int  endcol = n-1;

            while(startcol<endcol){
                int temp = matrix[rows][startcol];
                matrix[rows][startcol]= matrix[rows][endcol];
                matrix[rows][endcol] = temp;
                startcol++;
                endcol--;
            }
        }
    }
}