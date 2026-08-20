package Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class RowWithMaximumOnes {
    public static void main(String[] args) {
        int[][] mat = {{0,1},{1,0}};
        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[2];
        List<Integer> freqArray = new ArrayList<>();
        int maxCount = -1;
        for(int i=0; i<m; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            freqArray.add(count);
        }
        int max = Collections.max(freqArray);
        ans[0] = freqArray.indexOf(max);
        ans[1] = max;
        System.out.println(freqArray);
        
        System.out.println(Arrays.stream(ans).boxed().toList());

    }
}
