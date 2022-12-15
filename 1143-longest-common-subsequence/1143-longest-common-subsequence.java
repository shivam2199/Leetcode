class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int a [][] = new int [n+1][m+1];
        int i,j;
        for (i=0;i<n+1; i++){
            for (j=0;j<m+1; j++){
                if (i==0 || j==0){
                    a[i][j]=0;
                }
                else if (text1.charAt(i-1) == text2.charAt(j-1)){
                    a[i][j] = 1 + a[i-1][j-1];
                }
                else{
                    a[i][j] = (int)Math.max(a[i][j-1], a[i-1][j]);
                }
            }
        }
        return a[n][m];
    }
}