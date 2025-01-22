import java.util.TreeMap;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
public class TopKFrequent1{
    public static void main(String args[]){
        String words[] = {"i","love","leetcode","i","love","coding"};
        int k = 2;
        List<String> list = topKFrequent(words,k);
        for(String s : list)
          System.out.print(s+" ");
    }
    public static List<String> topKFrequent(String words[], int k){
        TreeMap<String,Integer> map = new TreeMap<>();
        for(String s : words)
          map.put(s,map.getOrDefault(s,0)+1);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : map.values())
          pq.offer(n);
        List<String> list = new ArrayList<>();
        for(int i = 0;i<k;i++){
           int n = pq.poll();
           String s = findWord(map,n);
           map.remove(s);
           list.add(s);
        }
        return list;
    }
    public static String findWord(TreeMap<String,Integer> map , int n){
        for(String s : map.keySet()){
            if(map.get(s) == n)
              return s;
        }
        return "";
    }
}