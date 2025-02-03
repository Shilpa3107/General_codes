public class StrictlyIncreasingOrDecreasing{
    public static void main(String args[]){
       int nums[] = {1,4,3,3,2};
       System.out.println(strictlyIncreasingOrDecreasing(nums));
    }
    public static int strictlyIncreasingOrDecreasing(int nums[]){
        // store the maximum subarray
      int max = 0;

      //checking for strictly increasing
      for(int i = 0;i<nums.length;i++){

        //used to count the length of subarray
        int len = 1;
        for(int j = i+1;j<nums.length;j++){

            //checking condition of strictly increasing
            if(nums[j-1] < nums[j])
             len++;

             //it means it is not strictly increasing therefore we check another subarray
            else 
              break;
        }

        // finding the maximum subarray length
        max = Math.max(max,len);
      }

     //checking for strictly decreasing 
      for(int  i = 0;i<nums.length;i++){

        //store the length of subarray
        int len = 1;
        for(int j = i+1;j<nums.length;j++){

            //checking condition of strictly decreasing
            if(nums[j-1] > nums[j])
             len++;

             //if further element is not strictly decreasing 
            else 
              break;
        }

        //finding the maximum length of subarray
        max = Math.max(max,len);
      }

      return max;
     
    }
}