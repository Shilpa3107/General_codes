import java.util.ArrayList;
import java.util.List;

class GreatestCandies {
    public static void main(String args[]){
        int candies[] = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int extra[] = new int[candies.length];
        for(int i = 0;i<candies.length;i++){
            extra[i] = candies[i]+extraCandies;
        }
       ArrayList<Boolean> list = new ArrayList<Boolean>();
        for(int i = 0;i<extra.length;i++){
            list.add(extraCandies(extra[i],candies));
        }
        return list;
    }
    public static boolean extraCandies(int extra, int candies[]){
        boolean flag = false;
        for(int i = 0;i<candies.length;i++){
            if(candies[i] <= extra)
                flag = true;
            else 
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
   
}