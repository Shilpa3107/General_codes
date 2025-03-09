import java.util.HashSet;
public class ContainsDuplicate1{
    public static void main(String args[]){
        int nums[] = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            if(set.contains(n))
              return true;
            else
              set.add(n);
        }
        return false;
    }
}