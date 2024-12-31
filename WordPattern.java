import java.util.HashMap;
import java.util.ArrayList;
public class WordPattern{
    public static void main(String args[]){
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern,s));
    }
    public static boolean wordPattern(String pattern, String s){
        HashMap<Character,String> map = new HashMap<Character,String>();
        ArrayList<String> list = new ArrayList<String>();
        for(String str : s.split(" "))
           list.add(str);
        if(pattern.length() != list.size())
          return false;
        for(int i =0;i<pattern.length();i++){
            if(!map.containsKey(pattern.charAt(i))){
                  if(map.containsValue(list.get(i)))
                    return false;
                map.put(pattern.charAt(i),list.get(i));
            }
            else if(!map.get(pattern.charAt(i)).equals(list.get(i)))
               return false;
        }
        return true;
    }
}