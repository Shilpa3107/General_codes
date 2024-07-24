import java.util.*;
class StringsEqualForBackspace {
    public static void main(String args[]){
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s,t)); 
    }
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)!='#')
               stack1.push(s.charAt(i));
            if(s.charAt(i)=='#' && !stack1.isEmpty())
                stack1.pop();
        }
        for(int i = 0;i<t.length();i++){
            if(t.charAt(i)!='#')
               stack2.push(t.charAt(i));
            if(t.charAt(i)=='#'  && !stack2.isEmpty())
                stack2.pop();
        }
        String s1 = "",s2 = "";
        for(int i = 0;i<stack1.size();i++){
            s1 = s1+stack1.get(i);
        }
        for(int i = 0;i<stack2.size();i++){
            s2 = s2+stack2.get(i);
        }
        if(s1.equals(s2))
            return true;
        else 
            return false;
    }
}