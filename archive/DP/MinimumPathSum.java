
public class MinimumPathSum {
    public static void main(String[] args) {
        // int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int[][] grid = {{1,2,3},{4,5,6}};
        int m = grid.length;
        int n = grid[0].length;

        for(int j=1; j<n; j++){
            grid[0][j] = grid[0][j-1]+grid[0][j];
        }

        for(int i=1; i<m; i++){
            grid[i][0] = grid[i][0]+grid[i-1][0];
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                grid[i][j] = Math.min(grid[i-1][j], grid[i][j-1])+grid[i][j];
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(grid[m-1][n-1]);
    }
}
