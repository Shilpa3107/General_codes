import java.util.*;
public class Majorityelement1{
    public static void main(String args[]){
     int nums[] = {2,2,1,1,1,2,2};
     System.out.println(majority(nums));
    }
    public static int majority(int nums[]){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> mapEle : map.entrySet()){
            if(mapEle.getValue() > nums.length/2)
            return mapEle.getKey();
        }
        return 0;
    }
}