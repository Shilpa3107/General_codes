public class ImageSmoother{
    public static void main(String args[]){
        int img[][] = {{100,200,100},{200,50,200},{100,200,100}};
        int arr[][] = imageSmoother(img);
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] imageSmoother(int img[][]){
      int arr[][] = new int[img.length][img[0].length];
      for(int i = 0;i<img.length;i++){
        for(int j = 0;j<img[i].length;j++){
            arr[i][j] = neighbor(img,i,j);
        }
      }
      return arr;
    }
    public static int neighbor(int arr[][], int row, int col){
        int rows = arr.length;
        int cols = arr[0].length;
        int avg = 0, c = 0;
        avg += arr[row][col];
        c++;
        for(int i = row-1;i<=row+1;i++){
            for(int j = col-1;j<=col+1;j++){
                if(i == row && j == col)
                  continue;
                if(i >= 0 && i < rows && j>=0 && j< cols){
                    avg += arr[i][j];
                    c++;
                }
            }
        }
        return (int)Math.floor(avg/c);
    }
}