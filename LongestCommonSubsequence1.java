public class LongestCommonSubsequence1{
    public static void main(String args[]){
        String x = "AGGTAB";
        String y = "GXTXAYB";
         System.out.print(longestCommonSubsequence(x.toCharArray(),y.toCharArray()));
    }
    public static int longestCommonSubsequence(char x[], char y[]){
        int m = x.length;
        int n = y.length;
        int dp[][] = new int[m+1][n+1];
        for(int i = 0;i<=m;i++){
            for(int j = 0;j<=n;j++){
                if(i==0 || j ==0)
                  dp[i][j] = 0;
                else if(x[i-1] == y[j-1])
                  dp[i][j] = dp[i-1][j-1]+1;
                else 
                   dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
}