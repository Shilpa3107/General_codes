import java.util.ArrayList;
class RotateImage {
public static void main(String args[]){
    int matrix[][] = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
    rotate(matrix);
    for(int i = 0;i<matrix.length;i++){
        for(int j = 0;j<matrix[0].length;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
}
    public static void rotate(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<matrix[0].length;i++){
            ArrayList<Integer> num = new ArrayList<Integer>();
            for(int j = 0;j<matrix.length;j++){
                num.add(matrix[j][i]);
            }
            for(int k = num.size()-1;k>=0;k--){
                list.add(num.get(k));
            }
           // System.out.println(list);
        }
        int i = 0, j = 0;
        for(int s : list){
            matrix[i][j] = s;
            j++;
            if(j == matrix[0].length){
                i++;
                j = 0;
            }
            if(i == matrix.length)
                break;
        }
    }
}