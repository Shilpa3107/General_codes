import java.util.HashSet;
public class ValidMatrix1{
    public static void main(String args[]){
       int matrix[][] = {{1,2,3},{3,1,2},{2,3,1}};
       System.out.println(validMatrix(matrix));
    }
    @SuppressWarnings("unchecked")
    public static boolean validMatrix(int matrix[][]){
        int n = matrix.length;
        HashSet<Integer>[]  row = new HashSet[n];
        HashSet<Integer>[] col = new HashSet[n];
        for(int i = 0;i<n;i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
        }
        for(int i =0;i<n;i++){
          for(int j = 0;j<n;j++){
            int value = matrix[i][j];
            if(row[i].contains(value) || col[j].contains(value))
              return false;
            row[i].add(value);
            col[j].add(value);
          }
        }
        return true;
    }
}