import java.util.ArrayList;
class SearchOn2DMatrix {
    public static void main(String args[]){
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                list.add(matrix[i][j]);
            }
        }
        int start = 0;
        int end = list.size()-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(list.get(mid) == target)
                return true;
            else if(list.get(mid) < target)
                start = mid+1;
            else 
                end = mid-1;
        }
        return false;
    }
}