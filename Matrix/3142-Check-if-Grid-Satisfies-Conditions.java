package Matrix;

class CheckGridSatisfiesConditions {
    public static void main(String[] args) {
        int[][] grid = {{1},{2},{3}};
        int m = grid.length;
        int n = grid[0].length;
        boolean valid = true;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i < m-1 && grid[i][j] != grid[i+1][j]){
                    valid = false;
                    break;
                }
                if(j < n-1 && grid[i][j] == grid[i][j+1]){
                    valid = false;
                    break;
                }
            }
        }
        System.out.println(valid);
    }
}
