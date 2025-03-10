import java.util.Stack;
public class ValidParentheses{
    public static void main(String args[]){
          String s = "()";
          System.out.println(validParentheses(s));
    }
    public static boolean validParentheses(String s){
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i = 1;i<s.length();i++){
            if(!stack.isEmpty() && s.charAt(i) == ')' && stack.peek() == '(')
               stack.pop();
            else if(!stack.isEmpty() && s.charAt(i) == ']' && stack.peek() == '[')
               stack.pop();
            else if(!stack.isEmpty() && s.charAt(i) == '}' && stack.peek() == '{')
               stack.pop();
            else 
              stack.push(s.charAt(i));
        }
        return stack.isEmpty();
    }
}