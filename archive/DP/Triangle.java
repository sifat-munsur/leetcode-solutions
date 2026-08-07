package archive.DP;

public class Triangle {
    public static void main(String[] args) {
        int[][] triangle = {{2},{3,4},{6,5,7},{4,1,8,3}};
        int m = triangle.length;
        for(int i=0; i<m; i++){
            for(int j=0; j<triangle[i].length; j++){
                System.out.print(triangle[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1; i<m; i++){
            for(int j=0; j<triangle[i].length; j++){
                if(j==0){
                    triangle[i][j] = triangle[i-1][j]+triangle[i][j];
                }
                else if(i==j){
                    triangle[i][j] = triangle[i-1][j-1]+triangle[i][j];
                }
                else{
                    triangle[i][j] += Math.min(triangle[i-1][j-1], triangle[i-1][j]);
                }
            }
        }

        System.out.println();
        for(int i=0; i<m; i++){
            for(int j=0; j<triangle[i].length; j++){
                System.out.print(triangle[i][j]+"  ");
            }
            System.out.println();
        }

        int ans = Integer.MAX_VALUE;
        for(int val : triangle[m-1]){
            ans = Math.min(ans, val);
        }
        System.out.println(ans);
    }
}
