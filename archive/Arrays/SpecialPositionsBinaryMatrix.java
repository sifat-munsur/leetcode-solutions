
import java.util.Arrays;

public class SpecialPositionsBinaryMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,0,0},{0,1,0},{0,0,1}};
        int[] row = new int[mat.length];
        int[] col = new int[mat[0].length];
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] ==1){
                    row[i]++;
                }
                if(mat[i][j] ==1){
                    col[j]++;
                }
            }
        }
        int count = 0;
        for(int i=0; i<row.length; i++){
            for(int j=0; j<col.length; j++){
                if(mat[i][j] == 1 && row[i] == 1 && col[j] == 1){
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println(Arrays.stream(row).boxed().toList());
        System.out.println(Arrays.stream(col).boxed().toList());
    }
}
