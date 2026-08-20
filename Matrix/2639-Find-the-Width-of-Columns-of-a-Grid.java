package Matrix;

import java.util.Arrays;

class WidthColumnsGrid {

    public static int findDigit(int n){
        int digit = 0;
        while(n>0){
            digit++;
            n= n/10;
        }
        return digit; 
    }
    public static void main(String[] args) {
        int[][] grid = {{-15,1,3},{15,7,12},{5,6,-2}};
        int m = grid.length;
        int n = grid[0].length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] > 0){
                    int x = findDigit(grid[i][j]);
                    ans[j] = Math.max(ans[j], x);
                }
                else{
                    int x = findDigit(-grid[i][j]);
                    ans[j] = Math.max(ans[j], x+1);
                }
            }
        }
        System.out.println(Arrays.stream(ans).boxed().toList());
    }
}
