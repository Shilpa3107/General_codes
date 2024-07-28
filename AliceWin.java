class AliceWin {
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5,10};
        System.out.println(canAliceWin(nums));
    }
    public static boolean canAliceWin(int[] nums) {
        int sum1 = 0, sum2 = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>=1 && nums[i]<=9)
                sum1 = sum1+nums[i];
            else
                sum2 = sum2+nums[i];
        }
        if(sum1 == sum2)
            return false;
        else
            return true;
    }
}