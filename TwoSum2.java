public class TwoSum2{
    public static void main(String args[]){
        int nums[] = {2,7,11,15};
        int target = 9;
        int arr[] = twoSum(nums,target);
        for(int n : arr)
          System.out.print(n+" ");
    }
    public static int[] twoSum(int nums[], int target){
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++)
              if(i!=j && nums[i]+nums[j] == target)
                return new int[]{i,j};
        }
        return new int[]{};
    }
}