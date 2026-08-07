
public class UniquePaths {
    public static void main(String[] args) {
        int m = 3, n = 7;
        int[][] nums = new int[m][n];
        for(int i=0; i<n; i++){
            nums[0][i] = 1;
        }
        for(int i=0; i<m; i++){
            nums[i][0] = 1;
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                nums[i][j] = nums[i-1][j]+nums[i][j-1];
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(nums[m-1][n-1]);
    }
}
