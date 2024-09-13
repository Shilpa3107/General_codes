class XorQueries {
    public static void main(String arg[]){
        int arr[] = {1,3,4,8};
        int queries[][] = {{0,1},{1,2},{0,3},{3,3}};
        int result[] = xorQueries(arr,queries);
        for(int n : result)
        System.out.print(n+" ");
    }
    public static int[] xorQueries(int[] arr, int[][] queries) {
        int result[] = new int[queries.length];
        for(int i = 0;i<queries.length;i++){
            result[i] = operation(queries[i][0],queries[i][1],arr);
        }
        return result;
    }
    public static int operation(int start , int end, int arr[]){
        if(start == end)
            return arr[start];
        int os = arr[start];
        for(int i = start+1;i<=end;i++){
            os = os^arr[i];
        }
        return os;
    }
}