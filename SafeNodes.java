import java.util.List;
import java.util.ArrayList;
public class SafeNodes{
    public static void main(String args[]){
         int graph[][] = {{1,2},{2,3},{5},{0},{5},{},{}};
         List<Integer> list = safeNodes(graph);
         for(int n : list)
           System.out.print(n+" ");
    }
    public static List<Integer> safeNodes(int graph[][]){
        List<Integer> list = new ArrayList<>();
        boolean stack[] = new boolean[graph.length];
        boolean visited[] = new boolean[graph.length];
        for(int i = 0;i<graph.length;i++){
            dfs(i,graph,stack,visited);
        }
        for(int i = 0;i<graph.length;i++){
            if(!stack[i])
              list.add(i);
        }
        return list;
    }
    public static boolean dfs(int node, int adj[][] , boolean isStack[], boolean visited[]){
        if(isStack[node])
          return true;
        if(visited[node])
          return false;
        isStack[node] = true;
        visited[node] = true;
        for(int i : adj[node]){
            if(dfs(i,adj,isStack,visited))
             return true;
        }
        isStack[node] = false;
        return false;
    }
}