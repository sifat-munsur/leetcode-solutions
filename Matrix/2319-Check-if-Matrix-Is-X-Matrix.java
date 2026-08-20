package Matrix;

class CheckMatrixXMatrix {
    public static void main(String[] args) {
        int[][] grid = {{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}};
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==j || i+j==n-1){
                    if(grid[i][j]==0){
                        System.out.println(false);
                        break;
                    }
                }
                else{
                    if(grid[i][j]!=0){
                        System.out.println(false);
                        break;
                    }
                }
                
            }
        }
        System.out.println(true);
    }
}
