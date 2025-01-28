public class MaximumNumberFishGrid{
    public static void main(String args[]){
        int grid[][] = {{0,2,1,0},{4,0,0,3},{1,0,0,4},{0,3,2,0}};
        System.out.println(maximumNumberFishGrid(grid));
    }
    public static int maximumNumberFishGrid(int grid[][]){
        int dc[] = {-1,1,0,0};
        int dr[] = {0,0,-1,1};
        int max = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] > 0)
              max = Math.max(max,dfs(grid,i,j,dr,dc));
            }
        }
        return max;
    }
    public static int dfs(int grid[][], int i, int j , int dr[], int dc[]){
        if(i<0 || i>=grid.length || j < 0 || j >=grid[0].length || grid[i][j] == 0)
          return 0;
        int fish = grid[i][j];
        grid[i][j] = 0;
        for(int k = 0;k<4;k++)
          fish += dfs(grid,i+dr[k],j+dc[k],dr,dc);
        return fish;
    }
}