import java.util.List;
import java.util.ArrayList;
public class ShoppingOffers{
    public static void main(String args[]){
       List<Integer> price = new ArrayList<>();
       price.add(2);
       price.add(5);
       List<List<Integer>> specials  = new ArrayList<>();
       List<Integer> offer = new ArrayList<>();
       offer.add(3);
       offer.add(0);
       offer.add(5);
       specials.add(offer);
       List<Integer> offer1 = new ArrayList<>();
       offer1.add(1);
       offer1.add(2);
       offer1.add(10);
       specials.add(offer1);
       List<Integer> needs = new ArrayList<>();
       needs.add(3);
       needs.add(2);
       System.out.println(shoppingOffers(price,specials,needs));
    }
    public static int shoppingOffers(List<Integer> price, List<List<Integer>> specials , List<Integer> needs){
        return helper(price,specials,needs,0);
    }
    public static int helper(List<Integer> price, List<List<Integer>> specials, List<Integer> needs, int pos){
        int local = baseCase(price,needs);
        for(int i = 0;i<specials.size();i++){
            List<Integer> offer = specials.get(i);
            List<Integer> temp = new ArrayList<>();
            for(int j = 0;j<needs.size();j++){
                if(needs.get(j) < offer.get(j)){
                    temp = null;
                    break;
                }
                temp.add(needs.get(j)-offer.get(j));
            }
            if(temp != null)
              local = Math.min(local,offer.get(offer.size()-1)+helper(price,specials,temp,i));
        }
        return local;
    }
    public static int baseCase(List<Integer> price, List<Integer> needs){
        int count = 0;
        for(int i = 0;i<price.size();i++)
          count += price.get(i)*needs.get(i);
        return count;
    }
}