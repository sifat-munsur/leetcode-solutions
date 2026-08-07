
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        // int[][] mat = {{1,1,1,1},
        //       {1,1,1,1},
        //       {1,1,1,1},
        //       {1,1,1,1}};
        int[][] mat = {{
                1,2,3},
              {4,5,6},
              {7,8,9}};
        int sum = 0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(i==j){
                    sum += mat[i][j];
                    sum += mat[i][mat[0].length-1-i];
                }
            }
        }
        if(mat.length%2==1){
            sum -= mat[mat.length/2][mat.length/2];
        }
        System.out.println(sum);
    }
}
