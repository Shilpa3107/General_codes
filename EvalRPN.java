import java.util.Stack;
class EvalRPN {
    public static void main(String args[]){
        String tokens[] = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0;i<tokens.length;i++){
            String s = tokens[i];
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                if(!stack.isEmpty()){
                    int x = stack.pop();
                    int y = stack.pop();
                    if(tokens[i].equals("+"))
                        stack.push(y+x);
                    if(tokens[i].equals("-"))
                        stack.push(y-x);
                    if(tokens[i].equals("*"))
                        stack.push(y*x);
                    if(tokens[i].equals("/"))
                        stack.push(y/x);
                }
            }
            else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.get(0);
    }
}