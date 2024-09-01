class Convert1DTo2D {
    public static void main(String args[]){
        int original[] = {1,2,3,4};
        int m = 2;
        int n = 2;
        int arr[][] = construct2DArray(original,m,n);
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length > m*n || m*n > original.length)
            return new int[0][0];
        int arr[][] = new int[m][n];
        int i = 0,j = 0;
        for(int k : original){
            arr[i][j] =k; 
            j++;
            if(j == n){
                j = 0;
                i++;
            }
        }
        return arr;
    }
}