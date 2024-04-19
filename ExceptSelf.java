class ExceptSelf {
    public static void main(String args[]){
        int nums[] = {1,2,3,4};
        int arr[] = productExceptSelf(nums);
        for(int i = 0;i<arr.length;i++)
        System.out.print(arr[i]+" ");

    }
    public static int[] productExceptSelf(int[] nums) {
        int prefix[] = new int[nums.length];
        int suffix[] = new int[nums.length];
        prefix[0] = 1;
        suffix[nums.length-1]=1;
        int arr[] = new int[nums.length];
        for(int i = 1;i<nums.length;i++)
            prefix[i] = prefix[i-1]*nums[i-1];
        for(int i = nums.length-2;i>=0;i--)
            suffix[i] = suffix[i+1]*nums[i+1];
        for(int i = 0;i<nums.length;i++)
            arr[i] = prefix[i]*suffix[i];
        return arr;
    }
}