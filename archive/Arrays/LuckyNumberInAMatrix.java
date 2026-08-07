
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumberInAMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        int row = matrix.length;
        int col = matrix[0].length;
        int[] rowArray = new int[row];
        int[] colArray = new int[col];
        Arrays.fill(rowArray, Integer.MAX_VALUE);
        Arrays.fill(colArray, Integer.MIN_VALUE);
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                int value = matrix[i][j];
                rowArray[i] = Math.min(rowArray[i], value);
                colArray[j] = Math.max(colArray[j], value);
            }
        }
        List<Integer> result = new ArrayList<>();
         for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j] == rowArray[i] && matrix[i][j] == colArray[j]){
                    result.add(matrix[i][j]);
                }
            }
        }
        System.out.println(result);        
    }
}
