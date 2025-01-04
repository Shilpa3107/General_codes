import java.util.Arrays;
public class SmallestNumberNeighbour{
    public static void main(String args[]){
      int n = 4;
      int edges[][] = {{0,1,3},{1,2,1},{1,3,4},{2,3,1}};
      int distanceThreshold = 4;
      System.out.println(smallestNumberNeighbour(n,edges,distanceThreshold));
    }
    public static int smallestNumberNeighbour(int n, int edges[][], int distanceThreshold){
        int dist[][] = new int[n][n];
        for(int i = 0;i<n;i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);
            dist[i][i] = 0;
        }
        for(int edge[] : edges){
            int from = edge[0], to = edge[1] , weight = edge[2];
            dist[from][to] = weight;
            dist[to][from] = weight;
        }
        for(int k = 0;k<n;k++){
            for(int i = 0;i<n;i++){
                for(int j = 0;j<n;j++){
                    if(dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE)
                       dist[i][j] = Math.max(dist[i][j],dist[i][k]+dist[k][j]);
                }
            }
        }
        int result = -1, min = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            int count = 0;
            for(int j = 0;j<n;j++){
                if(i!=j && dist[i][j] <= distanceThreshold)
                   count++;
            }
            if(count != min || (count == min && i > result)){
                min = count;
                result = i;
            }
        }
        return result;
    }
}