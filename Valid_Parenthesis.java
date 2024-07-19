import java.util.*;
public class Valid_Parenthesis{
    public static void main(String args[]){
       String s = "()))";
       System.out.println(check(s));
    }
    public static boolean check(String s){
        int count1=0,count2=0,count3=0;
        boolean flag = false;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)==')' || s.charAt(i)=='(')
            count1++;
            else if(s.charAt(i)==']' || s.charAt(i)=='[')
            count2++;
            else if(s.charAt(i)=='}' || s.charAt(i)=='{')
            count3++;
        }
        Stack<Character> stack = new Stack<Character>();
        if(s.length()>=2 && count1%2==0 && count2%2==0 && count3%2==0){
           for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}'){
                if(!stack.isEmpty()){
              if(s.charAt(i)==')'){
                char top = stack.pop();
                if(top == '(')
                flag = true;
                else{
                    flag = false;
                    break;
                }
              }
              if(s.charAt(i)==']'){
                char top = stack.pop();
                if(top == '[')
                flag = true;
                else{
                    flag = false;
                    break;
                }
              }
              if(s.charAt(i)=='}'){
                char top = stack.pop();
                if(top == '{')
                flag = true;
                else{
                    flag = false;
                    break;
                }
              }
            }
            else{
                flag = false;
            }
           }
           else
           flag = false;
        }
           if(!stack.isEmpty())
           flag = false;
        }
        else{
            flag = false;
        }
         return flag;
    }
}