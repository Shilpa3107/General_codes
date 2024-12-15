import java.util.HashSet;
public class FindFinalValue{
    public static void main(String args[]){
        int arr[] = {5,3,6,1,12};
        int original = 3;
         System.out.println(findFinalValue(arr,original));
    }
    public static int findFinalValue(int arr[],int original){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int n : arr)
          set.add(n);
        while(set.contains(original))
           original = original*2;
        return original;
    }
}