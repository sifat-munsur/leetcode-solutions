
public class CountNegativeNumbersSortedMatrix {
    public static void main(String[] args) {
        // int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int[][] grid = {{3,2},{1,0}};
        int r = grid.length;
        int ans = 0;
        for(int i=0; i<r; i++){
            int left = 0;
            int right = grid[0].length-1;
            while(left<=right){
                int mid = left + (right-left)/2;
                if(grid[i][mid]<0){
                    ans += right-mid+1;
                    right = mid-1;  
                }              
                else{
                    left = mid+1;
                }
            }
        }
        System.out.println(ans);
    }
}
