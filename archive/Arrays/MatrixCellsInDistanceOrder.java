package archive.Arrays;

import java.util.Arrays;

public class MatrixCellsInDistanceOrder {
    public static void main(String[] args) {

        int rows = 2, cols = 3, rCenter = 1, cCenter = 2;
        int res[][] = new int[rows * cols][2];
        int index = 0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){

                res[index][0] = i;
                res[index][1] = j;
                index++;
            }
        }
        Arrays.sort(res, (a, b) -> {
            int d1 = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int d2 = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
            return d1 - d2;
        });

        System.out.println(Arrays.deepToString(res));
    }
   
}
