public class EvenDigits{
    public static void main(String args[]){
        System.out.println(evenDigits(new int[]{12,345,2,6,7896}));
    }
    public static int evenDigits(int nums[]){
        int count = 0;
        for(int n : nums){
            String s = Integer.toString(n);
            if(s.length()%2==0)
              count++;
        }
        return count;
    }
}