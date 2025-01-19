import java.util.PriorityQueue;
public class TrappingRainWater{
    public static void main(String args[]){
       int heightMap[][] = {{1,4,3,1,3,2},{3,2,1,3,2,4},{2,3,3,2,3,1}};
       System.out.println(trappingRainWater(heightMap));
    }
    public static int trappingRainWater(int heightMap[][]){
        int dRow[] = {0,0,-1,1};
        int dCol[] = {-1,1,0,0};
        boolean visited[][] = new boolean[heightMap.length][heightMap[0].length];
        PriorityQueue<Cell> pq = new PriorityQueue<>();
        for(int i = 0;i<heightMap.length;i++){
            pq.offer(new Cell(heightMap[i][0],i,0));
            pq.offer(new Cell(heightMap[i][heightMap[0].length-1],i,heightMap[0].length-1));
            visited[i][0] = true;
            visited[i][heightMap[0].length-1] = true;
        }
        for(int i = 0;i<heightMap[0].length;i++){
            pq.offer(new Cell(heightMap[0][i],0,i));
            pq.offer(new Cell(heightMap[heightMap.length-1][i],heightMap.length-1,i));
            visited[0][i] = true;
            visited[heightMap.length-1][i] = true;
        }
        int totalWater = 0;
        while(!pq.isEmpty()){
            Cell curr = pq.poll();
            int currRow = curr.row;
            int currCol = curr.col;
            int minHeight = curr.height;
            for(int i = 0;i<4;i++){
                int neighborRow = currRow+dRow[i];
                int neighborCol = currCol+dCol[i];
                if(isValid(neighborRow,neighborCol,heightMap.length,heightMap[0].length) && !visited[neighborRow][neighborCol]){
                    int neighborHeight = heightMap[neighborRow][neighborCol];
                    if(neighborHeight < minHeight)
                      totalWater += minHeight-neighborHeight;
                    pq.offer(new Cell(Math.max(neighborHeight,minHeight),neighborRow,neighborCol));
                    visited[neighborRow][neighborCol] = true;
                }
            }
        }
        return totalWater;
    }
    private static class Cell implements Comparable<Cell>{
        int height;
        int row;
        int col;

        Cell(int height,int row,int col){
            this.height = height;
            this.row = row;
            this.col = col;
        }
        @Override 
        public int compareTo(Cell other){
            return Integer.compare(this.height,other.height);
        }
    }
    public static boolean isValid(int row,int col, int numRow, int numCol){
        return (row >= 0 && row < numRow && col >= 0 && col < numCol);
    }
}

