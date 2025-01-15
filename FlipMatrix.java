import java.util.Random;
import java.util.HashMap;
public class FlipMatrix{
    static HashMap<Integer,Integer> map;
    static int row, col, total;
    static Random rand;
    public static void main(String args[]){
       flipMatrix(3,1);
        printArr(flip());
        printArr(flip());
        printArr(flip());
        reset();
        printArr(flip());
    }
    public static void printArr(int arr[]){
        for(int n : arr)
         System.out.print(n+" ");
        System.out.println();
    }
    public static void flipMatrix(int m,int n){
       row = m;
       col = n;
       total = m*n;
       map = new HashMap<>();
       rand = new Random();
    }
    public static int[] flip(){
        int randInd = rand.nextInt(total--);
        int cell = map.getOrDefault(randInd,randInd);
        map.put(randInd,map.getOrDefault(total,total));
        return new int[]{cell/col,cell%col};
    }
    public static void reset(){
        map.clear();
        total = row*col;
    }
}