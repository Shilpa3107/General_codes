import java.util.Stack;
public class MinLength1{
    public static void main(String args[]){
        String s = "ABFCACDB";
        System.out.println(minLength(s));
    }
    public static int minLength(String s){
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0;i<s.length();i++){
            if(stack.isEmpty())
                stack.push(s.charAt(i));
            else if(s.charAt(i) == 'B' && stack.peek() == 'A')
                stack.pop();
            else if(s.charAt(i) == 'D' && stack.peek() == 'C')
               stack.pop();
            else 
               stack.push(s.charAt(i));
        }
        return stack.size();
    }
}