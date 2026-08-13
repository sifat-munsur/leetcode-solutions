package Arrays;

class RangeAddition {
    public static void main(String[] args) {
        int m = 3, n = 3;
        int[][] ops = {{2,2},
                        {3,3},
                        {3,3},
                        {3,3},
                        {2,2},
                        {3,3},
                        {3,3},
                        {3,3},
                        {2,2},
                        {3,3},
                        {3,3},
                        {3,3}};
        
        int minRow = m;
        int minCol = n;        
        for(int i=0; i<ops.length; i++){
            minRow = Math.min(minRow, ops[i][0]);
            minCol = Math.min(minCol, ops[i][1]);
        }
        System.out.println(minCol*minRow);
    }
}
