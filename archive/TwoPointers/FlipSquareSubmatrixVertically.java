package archive.TwoPointers;
public class FlipSquareSubmatrixVertically {
    public static void main(String[] args) {
        int[][] grid = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int x = 1, y = 0, k = 3;
        System.out.println();

        int top = x;
        int bottom = x+k-1;
        while(top<bottom){
            for(int j = y; j < y + k; j++) {
                int temp = grid[top][j];
                grid[top][j] = grid[bottom][j];
                grid[bottom][j] = temp;
            }
            top++;
            bottom--;
        }



    //    for (int i = x; i < x + k / 2; i++) {   
    //         int swap = x + k - 1 - (i - x);
    //         for (int j = y; j < y + k; j++) {
    //             int temp = grid[i][j];
    //             grid[i][j] = grid[swap][j];
    //             grid[swap][j] = temp;
    //         }
    //     }
        System.out.println();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}
