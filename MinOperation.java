import java.util.HashMap;
public class MinOperation{
    public static void main(String args[]){
      String boxes = "001011";
      int arr[] = minOperation(boxes);
      for(int n : arr)
        System.out.print(n+" ");
    }
    public static int[] minOperation(String boxes){
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i = 0;i<boxes.length();i++){
            if(boxes.charAt(i) == '1')
              map.put(i,true);
            if(boxes.charAt(i) == '0')
              map.put(i,false);
        }
        int arr[] = new int[boxes.length()];
        for(int i = 0;i<boxes.length();i++){
            arr[i] = value(map,i);
        }
        return arr;
    }
    public static int value(HashMap<Integer,Boolean> map , int ind){
        int sum = 0;
        for(int i : map.keySet()){
            if(map.get(i) == true)
              sum += Math.abs(ind-i);
        }
        return sum;
    }
}