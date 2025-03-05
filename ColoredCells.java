public class ColoredCells{
    public static void main(String args[]){
        int n = 4;
        System.out.println(coloredCells(n));
    }
    public static long coloredCells(int n){
        long nums = 1;
        int add = 4;
        while(n-->1){
            nums += add;
            add += 4;
        }
        return nums;
    }
}