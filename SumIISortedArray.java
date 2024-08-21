public class SumIISortedArray{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        int target = 9;
        int s[] = sum(arr,target);
        for(int n : s)
        System.out.print(n+" ");
    }
    public static int[] sum(int arr[],int target){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum==target)
            return new int[]{i+1,j+1};
            else if(sum<target)
            i++;
            else 
            j--;
        }
        return new int[]{-1,-1};
    }
}