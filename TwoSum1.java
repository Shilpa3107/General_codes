class TwoSum1{
public static void main(String args[]){
    int nums[] = {1,24,2,9,1,3,6};
    int target = 26;
    int arr[] = twoSum(nums,target);
    for(int n: arr){
        System.out.print(n+" ");
    }
}
    public static int[] twoSum(int[] nums, int target) {
      int ind1 = -1, ind2 = -1;
      for(int i = 0;i<nums.length;i++){
          for(int j = i+1;j<nums.length;j++){
              if(nums[i]+nums[j] == target){
                  ind1 = i;
                  ind2 = j;
                  break;
              }
          }
      }
     int arr[] = {ind1, ind2};
        return arr;
    }
}