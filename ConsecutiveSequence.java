import java.util.Arrays;
public class ConsecutiveSequence{
    public static void main(String args[]){

        int nums[] = {100,1,200,3,4,2};
        System.out.println(largest(nums));
    }
    public static int largest(int nums[]){
        if(nums.length == 0)
        return 0;
        int longest = 1;
        int count = 1;
        Arrays.sort(nums);
        for(int i = 1;i<nums.length;i++){
            if(nums[i-1] == nums[i])
            continue;
            else if(nums[i]-nums[i-1] == 1)
              count++;
            else{
                longest = Math.max(longest,count);
                count = 1;
            }
        }
        return Math.max(longest,count);
    }
}