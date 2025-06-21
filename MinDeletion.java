import java.util.HashMap;
public class MinDeletion{
    public static void main(String args[]){
        System.out.println(minDeletion("AABBCCAB",0));
    }
    public static int minDeletion(String word, int k){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : word.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int res = word.length();
        for(int a : map.values()){
            int delete = 0;
            for(int b : map.values()){
                if(a > b)
                  delete +=b;
                else if(b > a+k)
                  delete += b-(a+k);
            }
            res = Math.min(res,delete);
        }
        return res;
    }
}