class MaximumAverageSubarray {
    public static void main(String args[]){
        int nums[] = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums,k));
    }
    public static double findMaxAverage(int[] nums, int k) {
        if(nums.length < 2)
            return (double)nums[0]/1;
        double avg = 0;
        double max = 0;
        for(int i = 0;i<k;i++){
            avg = avg+nums[i];
        }
        max = avg/k;
        for(int i = k;i<nums.length;i++){
            avg += (nums[i]-nums[i-k]);
            max = Math.max(max,avg/k);
        }
        return max;
    }
}