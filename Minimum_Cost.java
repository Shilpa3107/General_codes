import java.util.Arrays;
public class Minimum_Cost{
    public static void main(String args[]){
        String source = "abcd";
        String target = "acbe";
        char original[] = {'a','b','c','c','e','d'};
        char changed[] = {'b','c','b','e','b','e'};
        int cost[] = {2,5,5,1,2,20};
        System.out.println(minimum_Cost(source,target,original,changed,cost));
    }
    public static long minimum_Cost(String source, String target, char original[], char changed[] , int cost[]){
        int dp[][] = new int[26][26];
        for(int i = 0;i<26;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
            dp[i][i] = 0;
        }
        for(int i = 0;i<cost.length;i++){
            dp[original[i]-'a'][changed[i]-'a'] = Math.min(dp[original[i]-'a'][changed[i]-'a'],cost[i]);
        }
        for(int k = 0;k<26;k++){
            for(int i = 0;i<26;i++)
                if(dp[i][k] < Integer.MAX_VALUE){
                    for(int j = 0;j<26;j++){
                        if(dp[k][j] < Integer.MAX_VALUE){
                            dp[i][j] = Math.min(dp[i][j],dp[k][j]+dp[i][k]);
                        }
                    }
            }
        }
        long ans = 0L;
        for(int i = 0;i<source.length();i++){
            int c1 = source.charAt(i)-'a';
            int c2 = target.charAt(i)-'a';
            if(dp[c1][c2] < Integer.MAX_VALUE){
                ans += (long)dp[c1][c2];
            }
            else 
              return -1L;
        }
        return ans;
    }
}