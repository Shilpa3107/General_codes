public class IncreasingTripletSubsequence{
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5};
        System.out.println(increasingTripletSubsequence(nums));
    }
    public static boolean increasingTripletSubsequence(int nums[]){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int n : nums){
            if(n<=first)
              first = n;
            else if(n<=second)
              second = n;
            else 
              return true;
        }
        return false;
    }
}