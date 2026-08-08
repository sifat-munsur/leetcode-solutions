package BinarySearch;

class Search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},
                        {2,5,8,12,19},
                        {3,6,9,16,22},
                        {10,13,14,17,24},
                        {18,21,23,26,30}};
        int target = 5;
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0; i<m; i++){
            if(target < matrix[i][0] || target > matrix[i][n-1]){
                continue;
            }
            int left = 0;
            int right = n-1;
            while(left<=right){
                int mid = left + (right-left)/2;
                if(matrix[i][mid] == target){
                    System.out.println(true);
                    break;
                }
                else if(matrix[i][mid] < target){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }

        }
        
        System.out.println(false);   
    }
}
