import java.util.HashMap;
public class FirstCompletelyPaint{
    public static void main(String args[]){
         int mat[][] = {{1,4},{2,3}};
         int arr[] = {1,3,4,2};
         System.out.println(firstCompletelyPaint(arr,mat));
    }
    public static int firstCompletelyPaint(int arr[], int mat[][]){
        HashMap<Integer,int[]> numToPos = new HashMap<>();
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                numToPos.put(mat[i][j],new int[]{i,j});
            }
        }
        for(int i = 0;i<arr.length;i++){
            int num[] = numToPos.get(arr[i]);
            int row = num[0];
            int col = num[1];
            mat[row][col] = -mat[row][col];
            if(checkRow(row,mat) || checkCol(col,mat))
              return i;
        }
        return -1;
    }
    public static boolean checkRow(int row, int mat[][]){
        for(int i = 0;i< mat[0].length;i++){
            if(mat[row][i] > 0)
             return false;
        }
        return true;
    }
    public static boolean checkCol(int col, int mat[][]){
        for(int i = 0;i<mat.length;i++){
            if(mat[i][col] > 0)
              return false;
        }
        return true;
    }
}