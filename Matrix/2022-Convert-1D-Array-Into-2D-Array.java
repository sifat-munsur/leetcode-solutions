package Matrix;

class Convert1DArray2DArray {
    public static void main(String[] args) {
        int[] original = {1,2,3};
        int m = 1, n = 3;
        int[][] matrix = new int[m][n];
        if(n*m != original.length){
            System.out.println("empty");
        }
        for(int i=0; i<original.length; i++){
            matrix[i/n][i%n] = original[i];
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
