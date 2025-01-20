public class SumVariableSubarray{
    public static void main(String args[]){
        int nums[] = {2,3,1};
        System.out.println(sumVariableSubarray(nums));
    }
    public static int sumVariableSubarray(int nums[]){
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += count(nums,Math.max(0,i-nums[i]),i);
        }
        return sum;
    }
    public static int count(int arr[], int start, int i){
        int sum = 0;
        for(int j = start;j<=i;j++){
            sum += arr[j];
        }
        return sum;
    }
}