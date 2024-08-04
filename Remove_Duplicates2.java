class Remove_Duplicates2 {
    public static void main(String args[]){
        int nums[] = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length < 3)
            return nums.length;
        int i = 0, j = 1;
        while(j<nums.length){
            if(nums[i] == nums[j])
            {
               if(i==0)
               {
                   i++;
                   j++;
               }
                else if(nums[i] == nums[i-1])
                    j++;
                else{
                    i++;
                    nums[i] = nums[j];
                    j++;
                }
            }
            else{
                    i++;
                    nums[i] = nums[j];
                    j++;
                }
        }
        return i+1;
    }
}