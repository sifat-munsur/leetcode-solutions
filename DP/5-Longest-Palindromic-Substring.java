package DP;

class LongestPalindromicSubstring {
    

    public static void main(String[] args) {
        String s = "babda";
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for(int i=0; i<n; i++){
            dp[i][i] = true;
        }
        int start = 0;
        int maxLen = 1;
        for(int len=2; len<n; len++){
            for(int i=0; i<n-len; i++){
                int j = len+i-1;
                if(s.charAt(i) == s.charAt(j)){
                    if (len == 2) {
                        dp[i][j] = true;
                    } 
                    else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }

                }
                if (dp[i][j] && len > maxLen) {
                    start = i;
                    maxLen = len;
                }
            }
        }

        System.out.println("Longest Palindrome: "
                + s.substring(start, start + maxLen));

        System.out.println("\nDP Table:");


        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
}
