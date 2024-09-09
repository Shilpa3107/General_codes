import java.util.ArrayList;
public class SpiralMatrix{
    public static void main(String args[]){
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,0,1,2},{3,4,5,6}};
        int m = arr.length;
        int n = arr[0].length;
        int dr[] = {0,1,0,-1};
        int dc[] = {1,0,-1,0};
        int di = 0;
        int r = 0, c = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean seen[][] = new boolean[m][n];
        for(int i = 0;i<m*n;i++){
            list.add(arr[r][c]);
            seen[r][c] = true;

            int newR = r+dr[di];
            int newC = c+dc[di];

            if(0 <= newR && newR < m && 0<= newC && newC < n && !seen[newR][newC]){
                r = newR;
                c = newC;
            }
            else{
                di = (di+1)%4;
                r = r+dr[di];
                c = c+dc[di];
            }
        }
        System.out.println(list);
    }
}