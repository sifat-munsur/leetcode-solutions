package Arrays;

class IslandPerimeter {
    public static void main(String[] args) {
        // int [][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int [][] grid = {{1}};
        int top = 0;
        int bottom = 0;
        int left = 0;
        int right = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    if( i==0 || grid[i-1][j] == 0){
                        top++;
                    }
                    if( j==0 || grid[i][j-1] == 0){
                        left++;
                    }
                    if(j==grid[0].length-1 || grid[i][j+1] == 0){
                        right++;
                    }
                    if(i==grid.length-1 || grid[i+1][j] == 0){
                        bottom++;
                    }
                }
            }
        }
        System.out.println(top+bottom+left+right);
    }
}
