import java.util.HashMap;
public class DominoesEquivalent{
    public static void main(String args[]){
           int dominoes[][] = {{1,2},{2,1},{3,4},{5,6}};
           System.out.println(dominoesEquivalent(dominoes));
    }
    public static int dominoesEquivalent(int dominoes[][]){
        HashMap<String,Integer> map = new HashMap<>();
        int count = 0;
        for(int d[] : dominoes){
            int a = Math.min(d[0],d[1]);
            int b = Math.max(d[0],d[1]);
            String key = a+","+b;
            int prev = map.getOrDefault(key,0);
            count += prev;
            map.put(key,map.getOrDefault(key,0)+1);
        }
        return count;
    }
}