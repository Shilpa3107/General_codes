import java.util.PriorityQueue;
import java.util.Arrays;
public class MinimumCostGrid{
    public static void main(String args[]){
         int grid[][] = {{1,1,1,1},{2,2,2,2},{1,1,1,1},{2,2,2,2}};
         System.out.println(minimumCostGrid(grid));
    }
    public static int minimumCostGrid(int grid[][]){
        int dir[][] = {{0,1},{0,-1},{1,0},{-1,0}};
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]); // min heap
        pq.offer(new int[]{0,0,0});
        int dist[][] = new int[grid.length][grid[0].length]; // calculate min cost
        for(int i = 0;i<grid.length;i++)
          Arrays.fill(dist[i],Integer.MAX_VALUE);
        dist[0][0] = 0;
        while(!pq.isEmpty()){
            int val[] = pq.poll();
            int cost = val[0], r = val[1], c = val[2];
            if(dist[r][c] != cost)  //outdated value
              continue;
            for(int i = 0;i<4;i++){
                int nr = r+dir[i][0];
                int nc = c+dir[i][1];
                int ncost = cost;
                if(nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length){
                if(i != grid[r][c]-1)
                  ncost += 1;
                if(dist[nr][nc] > ncost){
                    dist[nr][nc] = ncost;
                    pq.offer(new int[]{ncost,nr,nc});
                }
            }
            }
        }
        return dist[grid.length-1][grid[0].length-1];
    }
}