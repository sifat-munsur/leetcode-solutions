package Matrix;

import java.util.Arrays;

class DegreeEachVertex {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,1},{1,0,1},{1,1,0}};
        int m = matrix.length;
        int n = matrix[0].length;
        int[] ans = new int[m];
        for(int i=0; i<m; i++){
            int degree = 0;
            for(int j=0; j<n; j++){
                degree += matrix[i][j];
            }
            ans[i] = degree;
        }
        System.out.println(Arrays.stream(ans).boxed().toList());
    }
}
