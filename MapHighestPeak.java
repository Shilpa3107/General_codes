import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
public class MapHighestPeak{
    public static void main(String args[]){
        int isWater[][] = {{0,1},{0,0}};
        int cell[][] = mapHighestPeak(isWater);
        for(int i = 0;i<cell.length;i++){
            for(int j = 0;j<cell[0].length;j++){
                System.out.print(cell[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] mapHighestPeak(int isWater[][]){
        int dx[] = {0,0,1,-1};
        int dy[] = {1,-1,0,0};
        int cellHeight[][] = new int[isWater.length][isWater[0].length];
        for(int i = 0;i<isWater.length;i++)
           Arrays.fill(cellHeight[i],-1);
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0;i<isWater.length;i++){
            for(int j = 0;j<isWater[0].length;j++){
                if(isWater[i][j] == 1){
                    queue.offer(new int[]{i,j});
                    cellHeight[i][j] = 0;
                }
            }
        }
        int height = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0;i<size;i++){
                int curr[] = queue.poll();
                for(int d = 0;d<4;d++){
                    int nx = curr[0]+dx[d];
                    int ny = curr[1]+dy[d];
                    if(nx >= 0 && nx < isWater.length && ny >= 0 && ny < isWater[0].length && cellHeight[nx][ny] == -1){
                        cellHeight[nx][ny] = height;
                        queue.offer(new int[]{nx,ny});
                    }
                }
            }
            height++;
        }
        return cellHeight;
    }
}