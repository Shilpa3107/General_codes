import java.util.HashMap;
public class PrefixCommon{
    public static void main(String args[]){
         int A[] = {1,3,2,4};
         int B[] = {3,1,2,4};
         int arr[] = prefixCommon(A,B);
         for(int n : arr)
           System.out.print(n+" ");
    }
    public static int[] prefixCommon(int A[], int B[]){
        int arr[] = new int[A.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<A.length;i++){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
            map.put(B[i],map.getOrDefault(B[i],0)+1);
            arr[i] = count(map);
        }
        return arr;
    }
    public static int count(HashMap<Integer,Integer> map){
        int c = 0;
        for(int n : map.keySet()){
            if(map.get(n) > 1)
            c++;
        }
        return c;
    }
}