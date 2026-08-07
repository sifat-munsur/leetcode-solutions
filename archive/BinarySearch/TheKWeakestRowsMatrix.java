
import java.util.Arrays;

public class TheKWeakestRowsMatrix {
    public static void main(String[] args) {
        int[][] mat = 
                    {{1,1,1,1,1},
                    {1,0,0,0,0},
                    {1,1,0,0,0},
                    {1,1,1,1,0},
                    {1,1,1,1,1}};
        int k = 3;

        int m = mat.length;
        int[][] str = new int[m][2];
        for(int i=0; i<m; i++){
            int left = 0;
            int right = mat[0].length-1;
            while(left<=right){
                int mid = left + (right-left)/2;
                if(mat[i][mid]==1){
                    left=mid+1;  
                }              
                else{
                    right = mid-1;
                }
            }
            str[i][0] = left;
            str[i][1] = i;
        }

        Arrays.sort(str, (a,b) -> {
            if(a[0]==b[0]){
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });

        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i] = str[i][1];
        }
        System.out.println(Arrays.toString(result));
    }
}
