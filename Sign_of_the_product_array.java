class Sign_of_the_product_array {
    public static void main(String args[]){
        int nums[] = {-1,-2,-3,-4,3,2,1};
        System.out.println(arraySign(nums));
    }
    public static int arraySign(int[] nums) {
        double p = 1.0;
        for(int i = 0;i<nums.length;i++){
            p = p*nums[i];
        }
        if(p>0)
            return 1;
        else if(p<0)
            return -1;
        else
            return 0;
    }
}