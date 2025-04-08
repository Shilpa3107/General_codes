import java.util.ArrayList;
import java.util.HashSet;
public class MinimumNumberOperations{
    public static void main(String args[]){
         int nums[] = {4,5,6,4,4};
         System.out.println(minimumNumberOperations(nums));
    }
    public static int minimumNumberOperations(int nums[]){
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : nums)
          list.add(n);
        int count = 0;
        while(!checkDistinct(new HashSet<Integer>(), list)){
            if(list.size()>=3){
                list.remove(0);
                list.remove(0);
                list.remove(0);
                count++;
            }
            else if(list.size()<3){
                count++;
                break;
            }
        }
        return count;
        
    }
    public static boolean checkDistinct(HashSet<Integer> set, ArrayList<Integer> list){
        for(int n : list){
            if(set.contains(n))
             return false;
            set.add(n);
        }
        return true;
    }
}