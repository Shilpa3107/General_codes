import java.util.HashMap;
import java.util.Map;
class SneakyNumbers {
    public static void main(String args[]){
        int nums[] = {0,1,1,0};
        int arr[] = getSneakyNumbers(nums);
        for(int n : arr)
        System.out.print(n+" ");
    }
    public static int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int n : nums){
            if(map.containsKey(n))
              map.put(n,map.get(n)+1);
            else 
                map.put(n,1);
        }
        int arr[] = new int[2];
        int i =0;
        for(Map.Entry<Integer,Integer> mapEle : map.entrySet()){
            if(mapEle.getValue() > 1){
                arr[i] = mapEle.getKey();
                i++;
            }         
        }
        return arr;
    }
}