import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class UniquePalindrome{
    public static void main(String args[]){
      String s = "aabca";
      System.out.println(uniquePalindrome(s));
    }
    public static int uniquePalindrome(String s){
        HashMap<Character,ArrayList<Integer>> map = new HashMap<>();
        HashSet<String> set = new HashSet<String>();
        for(char ch : s.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,index(s,ch));
                ArrayList<Integer> list = index(s,ch);
                if(!list.isEmpty()){
                    for(int i = list.get(0)+1; i< list.get(1);i++)
                      set.add(ch+""+s.charAt(i)+""+ch);
                }
            }
        }
        return set.size();
        
    }
    public static ArrayList<Integer> index(String s, char ch){
        int firstIndex = -1 , lastIndex = -1;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == ch){
                firstIndex = i;
                break;
            }
        }
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i) == ch){
                lastIndex = i;
                break;
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(firstIndex != -1 && lastIndex != -1 && firstIndex < lastIndex){
            list.add(firstIndex);
            list.add(lastIndex);
        }
        return list;

    }
}