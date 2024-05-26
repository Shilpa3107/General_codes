public class Add2Mat {

    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[][] = {{2,4,7},{1,6,3},{8,0,4}};
        int c[][] = new int[3][3];
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a.length;j++){
                c[i][j] = a[i][j]+b[i][j];
            }
        }
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a.length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
