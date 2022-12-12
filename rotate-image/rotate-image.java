class Solution {
    public void rotate(int[][] matrix) {
        int i,j;
        int n = matrix.length;
        for (i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                int tmp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tmp;
            }
        }
        for (i=0;i<n;i++){
            for (j=0;j<n/2;j++){
                int t = matrix[i][j];
                matrix[i][j]= matrix[i][n-j-1];
                matrix[i][n-j-1] = t;
            }
        }
    }
}