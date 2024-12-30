public class ColumnsStrictlyIncreasing{
    public static void main(String args[]){
        int arr[][] = {{3,2},{1,3},{3,4},{0,1}};
        System.out.println(columnsStrictlyIncreasing(arr));
    }
    public static int columnsStrictlyIncreasing(int arr[][]){
        int count = 0;
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i+1][j] < arr[i][j]+1){
                    count += (arr[i][j]+1 - arr[i+1][j]);
                    arr[i+1][j] = arr[i][j]+1;
                }
            }
        }
        return count;
    }
}