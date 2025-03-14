public class MaxPosNeg{
    public static void main(String args[]){
        int nums[] = {-2,-1,-1,1,2,3};
        System.out.println(maxPosNeg(nums));
    }
    public static int maxPosNeg(int nums[]){
        int countPos = 0, countNeg = 0;
        for(int n : nums){
            if(n > 0)
              countPos++;
            else if(n < 0)
              countNeg++;
        }
        return Math.max(countPos,countNeg);
    }
}