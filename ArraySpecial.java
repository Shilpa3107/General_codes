public class ArraySpecial{
    public static void main(String args[]){
        int nums[] = {2,1,4};
        System.out.println(isArraySpecial(nums));
    }
    public static boolean isArraySpecial(int nums[]){
        //checking parity
        for(int i = 0;i<nums.length-1;i++){
            if(!((nums[i]%2==0 && nums[i+1]%2!=0) || (nums[i]%2!=0 && nums[i+1]%2==0)))
              return false;
        }
        return true;
    }
}