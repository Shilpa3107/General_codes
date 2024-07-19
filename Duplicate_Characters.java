import java.util.*;
public class Duplicate_Characters{
    public static void main(String args[]){
          String s = "shilpasinha";
          duplicate(s);
    }
    public static void duplicate(String s){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i),count(s,s.charAt(i)));
        }
        for(Map.Entry<Character,Integer> mapEle : map.entrySet()){
            if(mapEle.getValue()>1){
                System.out.println(mapEle.getKey()+" = "+mapEle.getValue());
            }
        }
    }
    public static int count(String s,char ch){
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(ch == s.charAt(i))
            count++;
        }
        return count;
    }
}