import java.util.HashMap;
public class ConstructKPalindrome{
    public static void main(String args[]){
       String s = "leetcode";
       int k = 3;
       System.out.println(constructKPalindrome(s,k));
    }
    public static boolean constructKPalindrome(String s, int k){
        if(s.length() < k)
          return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int c = 0;
        for(char ch : map.keySet()){
            if(map.get(ch) %2 != 0)
              c++;
        }
        if(c > k)
          return false;
        else 
          return true;
    }
}