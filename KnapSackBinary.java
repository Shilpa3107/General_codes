public class KnapSackBinary{
    public static void main(String args[]){
        int profit[] = {1,2,5,6};
        int wt[] = {2,3,4,5};
        int W = 8;
        int n = 4;
        int ans = 0;
        int k[][] = check(W,wt,profit,n);
        ans = k[k.length-1][k[0].length-1];
        for(int i = 0;i<k.length;i++){
            for(int j = 0;j<k[0].length;j++)
            System.out.print(k[i][j]+" ");
            System.out.println();
        }
        System.out.println("Answer: "+ans);
    }
    public static int[][] check(int W, int wt[], int val[], int n){
       int i = 0,w=0;
       int k[][] = new int[n+1][W+1];
       for(i = 0;i<=n;i++){
        for(w = 0;w<=W;w++){
            if(i==0 || w == 0)
            k[i][w] = 0;
            else if(wt[i-1] <= w)
            k[i][w] = Math.max(val[i-1]+k[i-1][w-wt[i-1]],k[i-1][w]);
            else 
            k[i][w] = k[i-1][w];
        }
       }
       return k;
    }
}