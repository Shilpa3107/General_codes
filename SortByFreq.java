import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Collections;
public class SortByFreq{
    public static void main(String args[]){
       String s = "tree";
       System.out.println(sortByFreq(s));
    }
    public static String sortByFreq(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
          map.put(ch,map.getOrDefault(ch,0)+1);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : map.values())
          pq.offer(n);
        String str = "";
        while(!pq.isEmpty()){
            int n = pq.poll();
            char ch = findWord(map,n);
            map.remove(ch);
            String s1 = ""+ch;
            str += s1.repeat(n);
        }
        return str;
    }
    public static char findWord(HashMap<Character,Integer> map, int n){
        for(char ch : map.keySet()){
            if(map.get(ch) == n)
               return ch;
        }
        return ' ';
    }
}