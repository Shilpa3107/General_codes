import java.util.HashSet;
public class Substring{
    public static void main(String args[]){
         String s = "ababa";
         HashSet<String> set = new HashSet<>();
         substring(s,0,new StringBuilder(),set);
         System.out.println(set.size());
    }
    public static void substring(String s, int index, StringBuilder curr, HashSet<String> set){
        if(index == s.length())
           return;

        for(int i = index;i<s.length();i++){
            curr.append(s.charAt(i));
            set.add(curr.toString());
            substring(s,i+1,curr,set);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}