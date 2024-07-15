class Sort_Color {
    public static void main(String args[]){
        int nums[] = {2,0,2,1,1,0};
        sortColors(nums);
        for(int i =0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void sortColors(int[] nums) {
        int count[] = new int[3];
        for(int i = 0;i<nums.length;i++){
            ++count[nums[i]];
        }
        for(int i = 1;i<3;i++){
            count[i] = count[i]+count[i-1];
        }
        int b[] = new int[nums.length];
        for(int i = nums.length-1;i>=0;i--){
            b[--count[nums[i]]] = nums[i];
        }
        for(int i = 0;i<nums.length;i++){
            nums[i] = b[i];
        }        
    }
}