class ValidMatrix {
    public static void main(String args[]){
        int rowSum[]={3,8};
        int colSum[]={4,7};
        int arr[][] = restoreMatrix(rowSum,colSum);
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
    public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int currRow[] = new int[rowSum.length];
        int currCol[] = new int[colSum.length];
        int originalMatrix[][] = new int[rowSum.length][colSum.length];
        for(int i = 0;i<rowSum.length;i++){
            for(int j = 0;j<colSum.length;j++){
                originalMatrix[i][j] = Math.min(rowSum[i]-currRow[i],colSum[j]-currCol[j]);
                
                currRow[i] += originalMatrix[i][j];
                currCol[j] += originalMatrix[i][j];
            }
        }
        return originalMatrix;
    }
}