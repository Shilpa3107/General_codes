import java.util.Stack;
public class ClearDigits{
    public static void main(String args[]){
        String s = "abc";
        System.out.println(clearDigits(s));
    }
    public static String clearDigits(String s){
        //created a stack
        Stack<Character> stack = new Stack<>();
        
        //traverse the array
        for(int i = 0;i<s.length();i++){
            if(!stack.isEmpty() && Character.isDigit(s.charAt(i)))
              stack.pop();
            else 
              stack.push(s.charAt(i));
        }

        //created a stringbuilder
        StringBuilder result = new StringBuilder();

        while(!stack.isEmpty()){
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }
}