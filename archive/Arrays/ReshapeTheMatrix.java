
import java.util.*;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] mat= {
            {1,2},
            {3,4}};
        int r=1, c= 4;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                list.add(mat[i][j]);            
            }
        }
        System.out.println(list);
        if(mat.length* mat[0].length == r*c){
            int[][] newMat = new int[r][c];
            int index = 0;
            for(int i=0; i<r; i++){
                for(int j=0; j<c; j++){
                    newMat[i][j] = list.get(index++);
                }
            }
            System.out.println(Arrays.deepToString(newMat));
        }
        else{
            System.out.println(Arrays.deepToString(mat));
        }

    }
}
