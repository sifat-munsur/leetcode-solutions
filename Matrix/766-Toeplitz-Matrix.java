package Matrix;

import java.util.ArrayList;
import java.util.List;

class ToeplitzMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<m*n; i++){
            list.add(matrix[i/n][i%n]);
        }
        for(int i=0; i<list.size()-4; i++){
            if(i%n != n-1){
                if(list.get(i) !=list.get(i+n+1)){
                    System.out.println(false);
                    break;
                }
            }
        }
        System.out.println(true);
        System.out.println(list);
    }
}
