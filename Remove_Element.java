class Remove_Element {
    public static void main(String args[]){
        int nums[] = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums,val));
    }
    public static int removeElement(int[] nums, int val) {
        int i = 0, j= 0;
        while(j<nums.length){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        // for(int k = 0;k<nums.length;k++){
        //     System.out.print(nums[k]+" ");
        // }
        return i;
    }
}