
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int wealth = 0;
        int res = Integer.MIN_VALUE;
        for(int i=0; i<accounts.length; i++){
            wealth = 0;
            for(int j=0; j<accounts[0].length; j++){
                wealth += accounts[i][j]; 
            }
            res = Math.max(wealth, res);
        }
        System.out.println(res);
    }
}
