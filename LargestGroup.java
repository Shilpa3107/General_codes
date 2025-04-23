import java.util.HashMap;
public class LargestGroup{
    public static void main(String args[]){
        int n = 13;
        System.out.println(largestGroup(n));
    }
    public static int largestGroup(int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(int i = 1;i<=n;i++){
            int key = 0, num = i;
            while(num!=0){
                key += num%10;
                num /= 10;
            }
            map.put(key,map.getOrDefault(key,0)+1);
            max = Math.max(max,map.get(key));
        }
        int count = 0;
        for(int key : map.keySet()){
            if(max == map.get(key))
              count++;
        }
        return count;
    }
}