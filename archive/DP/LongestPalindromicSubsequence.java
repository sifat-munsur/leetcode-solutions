package archive.DP;

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        String s = "TOTAL";
        int[][] dp = new int[s.length()][s.length()];
        for(int i=0; i<s.length(); i++){
            dp[i][i] = 1;
        }

        for(int len=2; len<=s.length(); len++){
            for(int i=0; i<=s.length()-len; i++){
                int j = len+i-1;
                if(s.charAt(i)==s.charAt(j)){
                    dp[i][j] = dp[i+1][j-1]+2;
                }
                else{
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[0][s.length()-1]);

        for(int i=0; i<s.length(); i++){
            for(int j=0; j<s.length(); j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
}
