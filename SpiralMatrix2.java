import java.util.ArrayList;
import java.util.List;
class SpiralMatrix2 {
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> list = spiralOrder(matrix);
        for(int n : list){
            System.out.print(n+" ");
        }
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        int dr[] = {0,1,0,-1};
        int dc[] = {1,0,-1,0};
        int di = 0;
        int r = 0, c = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        boolean seen[][] = new boolean[m][n];
        for(int i = 0;i<m*n;i++){
            list.add(matrix[r][c]);
            seen[r][c] = true;
            
            int newR = r+dr[di];
            int newC = c+dc[di];
            
            if (newR >= 0 && newR < m && newC >= 0 && newC < n && !seen[newR][newC]) {
                r = newR;
                c = newC;
            }
            else{
                di = (di+1)%4;
                r = r+dr[di];
                c = c+dc[di];
            }
        }
        return list;
    }
}