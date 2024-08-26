import java.util.Stack;
class BaseBall_Game {
    public static void main(String args[]){
        String operations[] = {"5","2","C","D","+"};
        System.out.println(calPoints(operations));
    }
    public static int calPoints(String[] operations) {
        Stack<String> stack = new Stack<String>();
        for(int i = 0;i<operations.length;i++){
            if(operations[i].equals("D"))
            {
                int x = Integer.parseInt(stack.peek());
                stack.push(Integer.toString(x*2));
            }
            else if(operations[i].equals("+")){
                int sum = Integer.parseInt(stack.get(stack.size()-1))+Integer.parseInt(stack.get(stack.size()-2));
                stack.push(Integer.toString(sum));
                sum = 0;
            }
            else if(operations[i].equals("C"))
            {
                stack.pop();
            }
            else
            {
                stack.push(operations[i]);
            }
        }
       int result = 0;
        for(String s: stack){
            result += Integer.parseInt(s);
        }
        return result;
    }
}