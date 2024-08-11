import java.util.ArrayList;
import java.util.List;
class Snake_In_A_Matrix {
    public static void main(String args[]){
        int n = 3;
        List<String> commands = new ArrayList<>();
        commands.add("RIGHT");
        commands.add("LEFT");
        commands.add("DOWN");

        System.out.println(finalPositionOfSnake(n,commands));
    }
    public static int finalPositionOfSnake(int n, List<String> commands) {
        int grid[][] = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                grid[i][j] = (i*n)+j;
            }
         }
        int i = 0, j =0;
        for(String s: commands){
            if(s.equals("RIGHT"))
                j++;
            else if(s.equals("LEFT"))
                j--;
            else if(s.equals("UP"))
                i--;
             else if(s.equals("DOWN"))
                i++;
        }
        // System.out.println(i+" "+j);
        // int k = 0;
        return grid[i][j];
    }
}