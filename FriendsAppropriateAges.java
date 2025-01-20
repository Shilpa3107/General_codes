import java.util.HashMap;
public class FriendsAppropriateAges{
    public static void main(String args[]){
        int ages[] = {16,16};
        System.out.println(friendsAppropriateAges(ages));
    }
    public static int friendsAppropriateAges(int ages[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        int c = 0;
        for(int n : ages)
          map.put(n,map.getOrDefault(n,0)+1);
        for(int a : map.keySet()){
            for(int b : map.keySet()){
                if(check(a,b))
                c += map.get(a)+(map.get(b)-((a==b)?1:0));
            }
        }
        return c;
    }
    public static boolean check(int a, int b){
        return !(b>a || b <= 0.5*a+7 ||(b>100 && a<100));
    }
}