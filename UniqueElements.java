import java.util.HashMap;
import java.util.PriorityQueue;
public class UniqueElements{
    public static void main(String args[]){
       String s = "leetcode";
       System.out.println(uniqueElements(s));
    }
    public static int uniqueElements(String s){
        //created hashmap to map index, character and frequency
        HashMap<Character,int[]> map = new HashMap<>();

        //traverse the string to store the elements in the map
        for(int i = 0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i)))
               map.put(s.charAt(i),new int[]{i,0});
            else 
            map.get(s.charAt(i))[1]++;
        }

        //create priority queue to store elements by first comparing frequency then comparing index
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            if(a[1] != b[1])
              return Integer.compare(a[1],b[1]);
            return Integer.compare(a[0],b[0]);
        });

        //traverse the map to store the elements in the priority queue
        for(char ch : map.keySet()){
            int n[] = map.get(ch);
            pq.offer(new int[]{n[0],n[1]});
        }

        return pq.peek()[1] != 0?-1 : pq.poll()[0];

    }
}