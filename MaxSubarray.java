public class MaxSubarray{
    public static void main(String args[]){
 
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarray(nums));
    }
    public static int maxSubarray(int nums[]){
        //create max variable to store maximum number
        int max = Integer.MIN_VALUE;

        //create curr variable to sum the elements of nums array
        int curr = 0;

        //traverse the array
        for(int n : nums){

            //add the elements in curr variable
            curr += n;

            //check if value of curr is greater than max, then define that value as max
            if(curr > max)
              max = curr;
            
            //if there is sum of negative numbers, initialize it zero as we want to have maximum sum
            if(curr < 0)
              curr = 0;
        }

        return max;
    }
}