import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
public class LetterCombination{
    public static void main(String args[]){
      String digits = "23";
      List<String> list = letterCombination(digits);
      for(String s : list)
       System.out.print(s+" ");
    }
    public static List<String> letterCombination(String digits){
        List<String> list = new ArrayList<>();
        if(digits.length()==0)
         return list;
         HashMap<Integer,String> map = new HashMap<>();
         map.put(2,"abc");
         map.put(3,"def");
         map.put(4,"ghi");
         map.put(5,"jkl");
         map.put(6,"mno");
         map.put(7,"pqrs");
         map.put(8,"tuv");
         map.put(9,"wxyz");
         backtrack(digits,0,new StringBuilder(),list,map);
         return list;
        
    }
    public static void backtrack(String digits, int ind, StringBuilder sb, List<String> list, HashMap<Integer,String> map){
        if(ind == digits.length()){
            list.add(sb.toString());
            return;
        }
        String s = map.get(Integer.parseInt(""+digits.charAt(ind)));
        for(char ch : s.toCharArray()){
            sb.append(ch);
            backtrack(digits,ind+1,sb,list,map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}