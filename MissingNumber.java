import java.util.Arrays;
public class MissingNumber{
    public static void main(String args[]){
         int nums[]={3,0,1};
         System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int nums[]){
        Arrays.sort(nums);
        
        //traverse the array
        for(int i = 0;i<nums.length;i++){

            //if the index does not matches the element then that element is missing
            if(i != nums[i])
            return i;
        }

        return nums[nums.length-1]+1;
    }
}