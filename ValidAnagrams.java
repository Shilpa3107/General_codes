import java.util.HashMap;
public class ValidAnagrams{
    public static void main(String args[]){
        String s = "anagram";
        String t = "naaamrg";
        System.out.println(check(s,t));
    }
    public static boolean check(String s, String t){

        if(s.length() != t.length())
        return false;

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(char ch : s.toCharArray())
        map.put(ch,map.getOrDefault(ch,0)+1);
        for(char ch :t.toCharArray()){
            if(!map.containsKey(ch) || map.get(ch) <1)
            return false;
            map.put(ch,map.get(ch)-1);
        }
        return true;
    }
}