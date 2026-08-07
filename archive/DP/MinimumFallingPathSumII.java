package archive.DP;

public class MinimumFallingPathSumII {
    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int i=0; i<n; i++){
            dp[0][i] = grid[0][i];
        }

        for(int i=1; i<m; i++){            
            for(int j=0; j<n; j++){
                int minRow = Integer.MAX_VALUE;
                for(int x=0; x<n; x++){
                    if(x==j){
                        continue;
                    }
                    else{
                        minRow = Math.min(minRow, dp[i-1][x]);
                    }
                }                
                dp[i][j] = minRow+grid[i][j];
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
