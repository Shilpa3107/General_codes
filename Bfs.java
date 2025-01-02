import java.util.List;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
public class Bfs{
    public static void main(String args[]){
       HashMap<String,List<String>> graph = new HashMap<>();
       graph.put("A",Arrays.asList("B","C"));
       graph.put("B",Arrays.asList("A","D","E"));
       graph.put("C",Arrays.asList("A","F"));
       graph.put("D",Arrays.asList("B"));
       graph.put("E",Arrays.asList("B","F"));
       graph.put("F",Arrays.asList("C","E"));
       List<String> bfsorder = bfsOrder(graph,"A");
       System.out.println(bfsorder);
    }
    public static List<String> bfsOrder(HashMap<String,List<String>> graph , String start){
        List<String> bfsorder = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        visited.add(start);
        while(!queue.isEmpty()){
            String node = queue.poll();
            bfsorder.add(node);
            for(String neighbour : graph.get(node)){
                if(!visited.contains(neighbour)){
                    queue.offer(neighbour);
                    visited.add(neighbour);
                }
            }

        }
        return bfsorder;
    }
}