import java.util.HashMap;
public class MinimumLengthOfString{
    public static void main(String args[]){
       String s = "abaacbcbb";
       System.out.println(minimumLengthOfString(s));
    }public static int minimumLengthOfString(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++)
          map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        int n = s.length();
        int del = 0;
        for(char ch : map.keySet())
            del += (map.get(ch)%2 == 1)?map.get(ch)-1: map.get(ch)-2;
        return n-del;
    }
}