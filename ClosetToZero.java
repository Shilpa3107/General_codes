import java.util.HashMap;
import java.util.Map;
public class ClosetToZero{
    public static void main(String args[]){
        int nums[] = {2,1,-1};
        System.out.println(closetToZero(nums));
    }
    public static int closetToZero(int nums[]){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int min = Math.abs(nums[0]);
        for(int n : nums){
            map.put(n,Math.abs(n));
            min = Math.min(min,Math.abs(n));
        }
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> mapEle : map.entrySet()){
            if(mapEle.getValue() == min)
              max = Math.max(max,mapEle.getKey());
        }
        return max;
    }
}