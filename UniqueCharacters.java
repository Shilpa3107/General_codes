import java.util.HashMap;
public class UniqueCharacters{
    public stati void main(String args[]){
        String s = "leetcode";
        System.out.println(uniqueCharacters(s));
    }
    public static int uniqueCharacters(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        HasMap<Character,Integer> map1 = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            map1.put(s.charAt(i),i);
        }
        int min = Integer.MAX_VALUE;
        for(char ch : s.toCharArray()){
            if(map.get(ch) == 1 && min > map1.get(ch))
               min = map1.get(ch);
        }
        return min == Integer.MAX_VALUE?-1:min;
    }
}