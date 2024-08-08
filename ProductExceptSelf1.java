class ProductExceptSelf1 {
    public static void main(String args[]){
        int nums[] ={1,2,3,4};
        nums = productExceptSelf(nums);
        for(int i = 0;i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }
    }
    public static int[] productExceptSelf(int[] nums) {
       int prefix[] = new int[nums.length];
       int suffix[] = new int[nums.length];
        prefix[0] = 1;
       suffix[nums.length-1] = 1;
       for(int i = 1;i<nums.length;i++){
           prefix[i] = prefix[i-1]*nums[i-1];
       }
       for(int i = nums.length-2;i>=0;i--){
           suffix[i] = suffix[i+1]*nums[i+1];
       }
        for(int i = 0;i<nums.length;i++){
            nums[i] = prefix[i]*suffix[i];
        }
        return nums;
    }
}