public class CountServers{
    public static void main(String args[]){
       int grid[][] = {{1,0},{0,1}};
       System.out.println(countServers(grid));
    }
    public static int countServers(int grid[][]){
        int row[] = new int[grid.length];
        int col[] = new int[grid[0].length];
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                row[i] += grid[i][j];
                col[j] += grid[i][j];
            }
        }
        int c = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == 1 && (row[i] > 1 || col[j] > 1))
                  c++;
            }
        }
        return c;
    }
}