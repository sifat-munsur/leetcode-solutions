package Matrix;

import java.util.ArrayList;
import java.util.List;

class ModifyTheMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,-1},{4,-1,6},{7,8,9}};
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        for(int j=0; j<n; j++){
            list.add(matrix[0][j]);
        }
            

        for(int i=1; i<m; i++){
            for(int j=0; j<n; j++){
                int current = matrix[i][j];
                if(current > list.get(j)){
                    list.set(j, current);
                }
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = list.get(j);
                }
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(list);

    }
}
