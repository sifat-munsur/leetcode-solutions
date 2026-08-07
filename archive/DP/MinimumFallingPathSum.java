
public class MinimumFallingPathSum {
    public static void main(String[] args) {
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        for(int i=0; i<n; i++){
            dp[0][i] = matrix[0][i];
        }
        for(int i=1; i<m; i++){
            for(int j=0; j<n; j++){
                if(j==0){
                    dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j+1])+matrix[i][j];
                }
                else if(j==n-1){
                    dp[i][j] = Math.min(dp[i-1][j-1], dp[i-1][j])+matrix[i][j];
                }
                else{
                    int d = Math.min(dp[i-1][j-1], dp[i-1][j+1]);
                    dp[i][j] = Math.min(d, dp[i-1][j])+matrix[i][j];
                }
            }
        }

        int ans = dp[m-1][0];
        for(int i=1; i<n; i++){
            ans = Math.min(ans, dp[m-1][i]);
        }
        System.out.println(ans);

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
}
