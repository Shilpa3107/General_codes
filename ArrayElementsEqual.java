public class ArrayElementsEqual{
    public static void main(String args[]){
         int nums[]={0,1,1,1,0,0};
         System.out.println(arrayElementsEqual(nums));
    }
    public static int arrayElementsEqual(int nums[]){
        int c = 0;
        for(int i = 2;i<nums.length;i++){
            if(nums[i-2] == 0){
                nums[i] = nums[i]^1;
                nums[i-1] = nums[i-1]^1;
                nums[i-2] = nums[i-2]^1;
                c++;
            }
        }
        return check(nums)?c:-1;

    }
    public static boolean check(int nums[]){
        for(int n : nums){
            if(n == 0)
              return false;
        }
        return true;
    }
}