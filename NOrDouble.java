import java.util.HashSet;
public class NOrDouble{
    public static void main(String args[]){

        int nums[] = {10,2,5,3};
        System.out.println(check(nums));
    }
    public static boolean check(int nums[]){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int n : nums){
            if(set.contains(n*2) || (n/2==0 && set.contains(n/2)))
              return true;
            else 
              set.add(n);
        }
        return false;
    }
}