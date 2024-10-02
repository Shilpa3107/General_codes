import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
class ArrayRankTransform {
    public static void main(String args[]){
        int arr[] = {40,10,30,20};
        arr = arrayRankTransform(arr);
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
    public static int[] arrayRankTransform(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int n: arr){
            list.add(n);
        }
        Collections.sort(list);
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int rank = 1;
        for(int n:list){
            if(!map.containsKey(n))
                map.put(n,rank++);
        }
        for(int i = 0;i<arr.length;i++){
            arr[i] = map.get(arr[i]);
        }
       
        return arr;
    }
}