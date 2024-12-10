import java.util.HashMap;
import java.util.Map;
public class SpecialSubstring{
    public static void main(String args[]){

        String s = "aaaa";
        System.out.println(check(s));
    }
    public static int check(String s){
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int start = 0; start < s.length(); start++){
            StringBuilder currString = new StringBuilder();
            for(int end = start; end < s.length(); end++){
                if(currString.length()==0 || currString.charAt(currString.length()-1) == s.charAt(end)){
                    currString.append(s.charAt(end));
                    map.put(currString.toString(),map.getOrDefault(currString.toString(),0)+1);
                }
                else 
                  break;
            }
        }
        int nums = -1;
        for(Map.Entry<String,Integer> mapEle : map.entrySet()){
            if(mapEle.getValue() >= 3 && mapEle.getKey().length() > nums)
               nums = mapEle.getKey().length();
        }
        return nums;
    }
}