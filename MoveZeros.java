public class MoveZeros{
    public static void main(String args[]){
         int nums[] = {0,1,0,3,12};
         moveZeroes(nums);
         for(int n : nums)
          System.out.print(n+" ");
    }
    public static void moveZeroes(int[] nums) {
        //count the number of zeros
        int count = 0;

        //finding the index
        int ind = 0;

        //traversing the arrays
        for(int n : nums){
            if(n == 0)
            // counting number of zeros
              count++;
            else{
                //putting non zero elements
                nums[ind] = n;
                ind++;
            }
        }

        //putting the zeros
        while(count-->0){
            nums[ind] = 0;
            ind++;
        }
    }
}