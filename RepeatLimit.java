import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Comparator;
public class RepeatLimit{
    public static void main(String args[]){
        String s = "cczazcc";
        int repeatLimit = 3;
        System.out.println(repeatLimits(s,repeatLimit));
    }
    public static String repeatLimits(String s, int repeatLimit){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(char ch : s.toCharArray())
          map.put(ch,map.getOrDefault(ch,0)+1);
        PriorityQueue<Character> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(char ch : map.keySet())
          pq.offer(ch);
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            char ch = pq.poll();
            int min = Math.min(map.get(ch),repeatLimit);
            sb.append((""+ch).repeat(min));
            if(map.get(ch) == min)
              map.remove(ch);
            else if(!pq.isEmpty()){
                char next = pq.poll();
                sb.append(next);
                if(map.get(next) == 1)
                  map.remove(next);
                else{
                    map.put(next,map.get(next)-1);
                    pq.offer(next);
                }
                map.put(ch,map.get(ch)-min);
                pq.offer(ch);
            }            
        }
        return sb.toString();
    }
}