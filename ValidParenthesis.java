import java.util.*;
public class ValidParenthesis {
   public static void main(String args[]){
    System.out.println(isValid("[({])}"));
}
    public static boolean isValid(String s) {
        int count1 = 0, count2 = 0, count3 = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) ==')')
                count1++;
            else if(s.charAt(i) == '[' || s.charAt(i) ==']')
                count2++;
            else if(s.charAt(i) == '{' || s.charAt(i) =='}')
                count3++;
        }
       Stack<Character> stack = new Stack<Character>();
        boolean flag = false;
        if(s.length() >=2 && (count1%2==0 && count2%2==0 && count3%2==0)){
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}'){
                if(!stack.isEmpty()){
                    char top = stack.pop();
                    if(s.charAt(i) == ')'){
                        if(top == '(')
                            flag = true;
                        else{
                            flag = false;
                            break;
                        }
                    }
                    else if(s.charAt(i) == ']'){
                        if(top == '[')
                            flag = true;
                        else{
                            flag = false;
                            break;
                        }
                    }
                    else if(s.charAt(i) == '}'){
                        if(top == '{')
                            flag = true;else{
                            flag = false;
                            break;
                        }
                    }
                }// closing of if which is checking stack is empty or not
                else{
                    flag = false;
                }
            }// closing of else if for closing brackets
         }//closing of for loop
        if(!stack.isEmpty()){
            flag = false;
        }
        } // closing of if ( if length of string is greater than or equal to 2)
        else{
            flag = false;
        }
        return flag;
    }
}
