public class MaxSumPair{
    public static void main(String args[]){
        int nums[] = {18,43,36,13,7};
        System.out.println(maxSumPair(nums));
    }
    public static int maxSumPair(int nums[]){
        //to store max value
        int max = -1;

        //to store elements based on num's sum of digit
        int sumArr[] = new int[82];

        //traversing array
        for(int n : nums){

            //checking if position is empty or not
            if(sumArr[sum(n)] > 0)

            //if not empty
            max = Math.max(max,sumArr[sum(n)]+n);

            //if empty
            sumArr[sum(n)] = Math.max(sumArr[sum(n)],n);
        }
        return max;
    }
    //calculate the sum of digits
    public static int sum(int num){
        int sum = 0;
        while(num > 0){
            int dig = num%10;
            sum += dig;
            num /= 10;
        }
        return sum;
    }
}