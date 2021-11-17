package array;

import java.util.Arrays;

class Main
{
    // Function to convert the matrix
    private static void convert(int[][] mat)
    {
        // base case
        if (mat == null || mat.length == 0) {
            return;
        }

        int M = mat.length;
        int N = mat[0].length;

        boolean rowFlag = false, colFlag = false;

        // scan the first row for any 0's
        for (int j = 0; j < N; j++)
        {
            if (mat[0][j] == 0)
            {
                rowFlag = true;
                break;
            }
        }

        // scan the first column for any 0's
        for (int i = 0; i < M; i++)
        {
            if (mat[i][0] == 0)
            {
                colFlag = true;
                break;
            }
        }

        // process the rest of the matrix and use the first row and the
        // first column to mark if any cell in the corresponding
        // row or column has a value 0 or not
        for (int i = 1; i < M; i++)
        {
            for (int j = 1; j < N; j++)
            {
                if (mat[i][j] == 0) {
                    mat[0][j] = mat[i][0] = 0;
                }
            }
        }

        // if `(0, j)` or `(i, 0)` is 0, assign 0 to cell `(i, j)`
        for (int i = 1; i < M; i++)
        {
            for (int j = 1; j < N; j++)
            {
                if (mat[0][j] == 0 || mat[i][0] == 0) {
                    mat[i][j] = 0;
                }
            }
        }

        // if `rowFlag` is true, then assign 0 to all cells of the first row
        for (int i = 0; rowFlag && i < N; i++) {
            mat[0][i] = 0;
        }

        // if `colFlag` is true, then assign 0 to all cells of the first column
        for (int i = 0; colFlag && i < M; i++) {
            mat[i][0] = 0;
        }
    }

    public static void setZero(int[][] matrix){
        int col0=1, rows = matrix.length,cols  = matrix[0].length;

        for(int i =0; i<rows; i++){
            if(matrix[i][0]==0) col0=0;
            for(int j =1; j<cols; j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = matrix[0][i] =0;
                }
            }
        }

        for(int i = rows-1; i>=0; i--){
            for(int j =cols-1; j>=1; j--){
                if(matrix[i][0]==0 || matrix[0][j]== 0){
                    matrix[i][j]= 0;
                }
            }
            if(col0==0) matrix[i][0] = 0;
        }

        for(var r: matrix){
            System.out.println(Arrays.toString(r));
        }
    }

    public static void main(String[] args)
    {
        int[][] mat =
                {
                        { 5, 3, 0, 8, 1 },
                        { 8, 1, 8, 4, 7 },
                        { 2, 6, 5, 0, 3 },
                        { 1, 4, 2, 7, 9 },
                        { 0, 1, 3, 6, 5 }
                };

        // convert the matrix
        convert(mat);

        // print matrix
        for (var r: mat) {
            System.out.println(Arrays.toString(r));
        }

        System.out.println("----------------------------");
        setZero(mat);


    }
}