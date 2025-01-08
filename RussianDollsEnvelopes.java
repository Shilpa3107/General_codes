import java.util.Arrays;
public class RussianDollsEnvelopes{
    public static void main(String args[]){
       int envelopes[][] = {{5,4},{6,4},{6,7},{2,3}};
       System.out.print(russianDollsEnvelopes(envelopes));
    }
    public static int russianDollsEnvelopes(int envelopes[][]){
        Arrays.sort(envelopes,(a,b)->{
            if(a[0] != b[0])
              return Integer.compare(a[0],b[0]);
            else 
              return Integer.compare(b[1],a[1]);
        });
        int heights[] = new int[envelopes.length];
        for(int i = 0;i<envelopes.length;i++)
          heights[i] = envelopes[i][1];
        return findLTS(heights);
    }
    public static int findLTS(int heights[]){
        int dp[] = new int[heights.length];
        int length = 0;
        for(int height : heights){
            int ind = Arrays.binarySearch(dp,0,length,height);
            if(ind < 0)
              ind = -(ind+1);
            dp[ind] = height;
            if(ind == length)
              length++;
        }
        return length;
    }
}