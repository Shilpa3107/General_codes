import java.util.HashMap;
import java.util.Map;
public class ClosestToZero{
    public static void main(String args[]){

        int nums[] = {-4,-2,1,4,8};
        System.out.println(closestToZero(nums));
    }
    public static int closestToZero(int nums[]){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int m = Integer.MAX_VALUE;
        for(int n : nums){
            map.put(n,(int)Math.abs(n));
            m = Math.min(m,(int)Math.abs(n));
        }
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> mapEle : map.entrySet()){
            if(mapEle.getValue() == m)
              max = Math.max(max,mapEle.getKey());
        }
        return max;

    }
}