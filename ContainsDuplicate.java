import java.util.HashSet;
public class ContainsDuplicate{
    public static void main(String args[]){
       int nums[] = {1,2,3,1};
       System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums)
          set.add(n);
        return set.size()<nums.length?true:false;
    }
}