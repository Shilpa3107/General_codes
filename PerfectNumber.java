public class PerfectNumber{
    public static void main(String args[]){
        int num = 7;
        System.out.println(perfectNumber(num));
    }
    public static boolean perfectNumber(int num){
        //create a variable to count the divisiors
        int count = 0;

        //created a for loop to find the divisors of `num`
        for(int i = 1;i<num;i++){

            //if divisor is found, add it to `count` variable
            if(num%i == 0)
              count += i;
            
            //if count's value is greater than num it means it is not a perfect number therefore return false
            if(count > num)
              return false;
        }

        //check if num is perfect number by adding all its divisors
        return count==num;
    }
}