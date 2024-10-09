import java.util.Stack;
class MinAddToMakeValid {
    public static void main(String args[]){
        String s = "(())))";
        System.out.println(minAddToMakeValid(s));
    }
    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0;i<s.length();i++){
            if(stack.isEmpty())
                stack.add(s.charAt(i));
            else if(s.charAt(i) == ')' && stack.peek() == '(')
                stack.pop();
            else 
                stack.push(s.charAt(i));
        }
        
        return stack.size();
    }
}