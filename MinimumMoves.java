import java.util.Arrays;
public class MinimumMoves{
    public static void main(String args[]){
        int arr[] = {1,2,3};
        System.out.println(minimumMoves(arr));
    }
    public static int minimumMoves(int arr[]){
        Arrays.sort(arr);
        int mid = 0+(arr.length-0)/2;
        int c = 0;
        for(int n : arr)
          c += Math.abs(n-arr[mid]);
        return c;
    }
}