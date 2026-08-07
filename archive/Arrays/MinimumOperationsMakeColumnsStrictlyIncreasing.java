
public class MinimumOperationsMakeColumnsStrictlyIncreasing {
    public static void main(String[] args) {
        int[][] grid = {{3,2},{1,3},{3,4},{0,1}};
        int operation = 0;
        for(int j=0; j<grid[0].length; j++){
            for(int i=1; i<grid.length; i++){
                if(grid[i-1][j]>=grid[i][j]){
                    int value = grid[i-1][j] + 1;
                    operation += value-grid[i][j];
                    grid[i][j] = value;
                }
            }
        }
        System.out.println(operation);
    }
}
