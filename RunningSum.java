class RunningSum {
    public static void main(String args[]){
        int nums[] = {1,2,3,4};
        int arr[] = runningSum(nums);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] runningSum(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            arr[i] = sum(nums,i);
        }
        return arr;
    }
    public static int sum(int nums[], int ind){
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            if(i <= ind)
                sum = sum+nums[i];
        }
        return sum;
    }
}