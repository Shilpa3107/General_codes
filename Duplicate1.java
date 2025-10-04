import java.util.HashSet;
public class Duplicate1{
    public static void main(String args[]){
        int nums[] = {1,2,3,1};
        System.out.println(duplicate(nums));
    }
    public static boolean duplicate(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            if(set.contains(n))
              return true;
            set.add(n);
        }
        return false;
    }
}