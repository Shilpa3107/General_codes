import java.util.*;
public class Hand_to_Straight {
 public static void main(String args[]){
    int hand[] = {1,2,3,6,2,3,4,7,8};
            if(hand.length%3 == 0){
                System.out.print(consecutive(hand));
                System.out.println();
             }
 }
    public static ArrayList<ArrayList<Integer>>  consecutive(int hand[]){
         Arrays.sort(hand);
        ArrayList<Integer> hand1 = new ArrayList<Integer>();
        for(int i = 0;i<hand.length;i++){
            hand1.add(hand[i]);
        }
         ArrayList<Integer> list = new ArrayList<Integer>();
         ArrayList<ArrayList<Integer>> list1 = new ArrayList<ArrayList<Integer>>();
        while(!hand1.isEmpty()){
            int i = 1;
         for(i = 1;i<hand1.size();i++){
            if((hand1.get(i)-hand1.get(i-1)) == 1)
            {
               list.add(hand1.get(i));
               list.add(hand1.get(i-1));
                hand1.remove(i);
                hand1.remove(i-1);
            }
          else{
                 list1.add(list);
                 list.clear();
             }
        
            i = 1;
        }
        
    }
        return list1;
   
}
}