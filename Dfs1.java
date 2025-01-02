import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
public class Dfs1{
    HashMap<Integer,ArrayList<Integer>> graph;
    public Dfs1(){
        graph = new HashMap<>();
    }
    public void addEdge(int src, int dest){
        graph.putIfAbsent(src,new ArrayList<>());
        graph.get(src).add(dest);
        graph.putIfAbsent(dest,new ArrayList<>());
        graph.get(dest).add(src);
    }
    public void dfs(int start){
        Set<Integer> visited = new HashSet<>();
        dfsRecursive(start,visited);
    }
    public void dfsRecursive(int node, Set<Integer> visited){
        visited.add(node);
        System.out.print(node+" ");
        for(int neighbour : graph.get(node)){
            if(!visited.contains(neighbour))
              dfsRecursive(neighbour,visited);
        }
    }
    public static void main(String args[]){
        Dfs1 graph = new Dfs1();
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
        graph.dfs(0);
    }
}