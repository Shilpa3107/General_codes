import java.util.Arrays;
public class DivideArray{
    public static void main(String args[]){
       int nums[] = {1,3,4,8,7,9,3,5,1};
       int k = 2;
       int arr[][] = divideArray(nums, k);
       for(int n[] : arr){
        System.out.println(n[0]+" "+n[1]+" "+n[2]);
       }
    }
    public static int[][] divideArray(int nums[],int k){
        if(nums.length%3!=0)
           return new int[0][];
        
        Arrays.sort(nums);
        int arr[][] = new int[nums.length/3][3];
        int i = 0, j = 0;
        for(int n : nums){
            arr[i][j++] = n;
            if(j==3){
                i++;
                j = 0;
            }
        }
        for(int n[] : arr){
            if(!check(n,k))
               return new int[0][];
        }

        return arr;

    }
    public static boolean check(int nums[], int k){
        int min = Math.min(nums[0],Math.min(nums[1],nums[2]));
        int max = Math.max(nums[0],Math.max(nums[1],nums[2]));
        return max-min <= k;
    }
}