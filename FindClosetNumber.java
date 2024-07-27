class FindClosetNumber {
    public static void main(String args[]){
        int nums[] = {-1,1,0};
        System.out.println(findClosestNumber(nums));
    }
    public static int findClosestNumber(int[] nums) {
   int ans = nums[0];
        int diff = Math.abs(nums[0]);
        for(int i = 1;i<nums.length;i++){
            if(Math.abs(nums[i]) < diff){
                diff = Math.abs(nums[i]);
                ans = nums[i];
            }
            if(Math.abs(nums[i]) == diff && nums[i] > ans)
                ans = nums[i];
        }
        return ans;
    }
}