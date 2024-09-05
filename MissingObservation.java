import java.util.Arrays;
public class MissingObservation{
    public static void main(String args[]){
        int rolls[] = {3,2,4,3};
        int m = 4;
        int n = 2;
        int arr[] = check(rolls,m,n);
        for(int k:arr)
        System.out.print(k+" ");
    }
    public static int[] check(int rolls[], int m, int n){
        int total_observations = rolls.length+n;
        int total_sum = m*total_observations;
        int sum = 0;
        for(int k:rolls)
         sum += k;

         int remainSum = total_sum-sum;
         if(remainSum > 6*n || remainSum < n)
         return new int[0];
         int arr[] = new int[n];
         int distributed = remainSum/n;
         int mod = remainSum%n;
         Arrays.fill(arr,distributed);
         for(int i = 0;i<mod;i++)
         arr[i]++;
         return arr;
    }
}