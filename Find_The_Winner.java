import java.util.ArrayList;
class Find_The_Winner {
    public static void main(String args[]){
        System.out.println(findTheWinner(5,2));
    }
    public static int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int p =0;p<n;p++){
            list.add(p+1);
        }
        int i = 0;
        while(list.size() > 1 ){
            i = (i+k-1)%list.size();
            list.remove(i);
        }
        
        return list.get(0);
    }
}