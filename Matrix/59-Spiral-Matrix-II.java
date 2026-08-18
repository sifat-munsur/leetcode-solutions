package Matrix;

class SpiralMatrix {
    public static void main(String[] args) {
        int n = 1;
        int[][] matrix = new int[n][n];
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right =n-1;
        int val = 1;
        while(top<=bottom && left<=right){
            for(int i=left; i<=right; i++){
                matrix[top][i] = val++; 
            }
            top++;
            for(int i=top; i<=bottom; i++){
                matrix[i][right] = val++;
            }
            right--;
            for(int i=right; i>=left; i--){
                matrix[bottom][i] = val++;
            }
            bottom--;
            for(int i=bottom; i>=top; i--){
                matrix[i][left] = val++;
            }
            left++;
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
