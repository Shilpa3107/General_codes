import java.util.Arrays;
public class GridGame{
    public static void main(String args[]){
        int grid[][] = {{2,5,4},{1,5,1}};
        System.out.println(gridGame(grid));
    }
    public static long gridGame(int grid[][]){
        long topsum = Arrays.stream(grid[0]).asLongStream().sum();
        long bottomsum = 0;
        long ans = Long.MAX_VALUE;
        for(int i = 0;i<grid[0].length;i++){
            topsum -= grid[0][i];
            ans = Math.min(ans,Math.max(topsum,bottomsum));
            bottomsum += grid[1][i];
        }
        return ans;
    }
}