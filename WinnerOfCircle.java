import java.util.ArrayList;
public class WinnerOfCircle{
    public static void main(String args[]){
       int n = 5, k = 2;
       System.out.println("Winner : "+winnerOfCircle(n,k));
    }
    public static int winnerOfCircle(int n , int k){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1;i<=n;i++){
            list.add(i);
        }
        int ind = 0;
        while(list.size() > 1){
            ind = (ind+k-1)%list.size();
            list.remove(ind);
        }
        return list.get(0);
    }
}