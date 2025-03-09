import java.util.Arrays;
public class MissingNumber1{
    public static void main(String args[]){
       int nums[] = {3,0,1};
       System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int nums[]){
        Arrays.sort(nums);
        int n = 0;
        for(int i : nums){
            if(i != n)
              return n;
            else 
              n++;
        }
        return n;
    }
}