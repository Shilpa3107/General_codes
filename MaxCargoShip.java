public class MaxCargoShip{
    public static void main(String args[]){
        int n = 2;
        int w = 3;
        int maxWeight = 15;
        System.out.println(maxCargoShip(n,w,maxWeight));
    }
    public static int maxCargoShip(int n, int w, int maxWeight){
        long f = 0, num = n*n;
        int c = 0;
        while(num-->0){
            f += w;
            if(maxWeight >= f)
              c++;
            else 
               break;
        }
        return c;
    }
}