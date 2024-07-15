class Two_Sum {
    public static void main(String args[]){
        int nums[] = {2,7,11,15};
        int target = 9;
        int arr[] = twoSum(nums,target);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int ind1 = -1,ind2 = -1;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target && i!=j)
                {
                    ind1 = i;
                    ind2 = j;
                }
            }
        }
        int arr[] = {ind1,ind2};
        return arr;
    }
}