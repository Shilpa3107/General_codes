import java.util.Arrays;
public class RottenOranges{
    public static void main(String args[]){
      int grid[][] = {{2,1,1},{1,1,0},{0,1,1}};
      System.out.println(rottenOranges(grid));
    }
    public static int rottenOranges(int grid[][]){
      int c = 0;
      while(check(grid)){
        int newGrid[][] = rotten(grid);
        if(isSame(grid,newGrid))
          return -1;
        grid = newGrid;
        c++;
      }
      return c;
    }
    public static boolean check(int grids[][]){
        for(int i = 0;i<grids.length;i++){
            for(int j = 0;j<grids[i].length;j++){
                if(grids[i][j] == 1)
                  return true;
            }
        }
        return false;
    }
    public static boolean isSame(int grids1[][], int grids2[][]){
        for(int i = 0;i<grids1.length;i++){
            for(int j = 0;j<grids1[i].length;j++){
                if(grids1[i][j] != grids2[i][j])
                  return false;
            }
        }
        return true;
    }
    public static int[][] rotten(int grid[][]){
        int grids[][] = new int[grid.length][];
        for(int i = 0;i<grid.length;i++){
            grids[i] = Arrays.copyOf(grid[i],grid[i].length);
        }
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j] == 2){
                    if(i-1 >= 0 && grid[i-1][j] == 1)
                     grids[i-1][j] = 2;
                    if(i+1 < grid.length && grid[i+1][j] == 1)
                      grids[i+1][j] = 2;
                    if(j-1 >= 0 && grid[i][j-1] == 1)
                      grids[i][j-1] = 2;
                    if(j+1 < grids[i].length && grid[i][j+1] == 1)
                      grids[i][j+1] = 2;
                }
            }
        }
        return grids;
    }
}