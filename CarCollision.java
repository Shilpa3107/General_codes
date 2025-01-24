import java.util.Stack;
public class CarCollision{
    public static void main(String args[]){
       String directions = "RLRSLL";
       System.out.println(carCollision(directions));
    }
    public static int carCollision(String directions){
        Stack<Character> stack = new Stack<>();
        int count = 0;
        stack.push(directions.charAt(0));
        for(int i = 1;i<directions.length();i++){
            char curr = directions.charAt(i);
            if(stack.peek()=='R' && curr == 'L'){
                count += 2;
                curr = 'S';
                stack.pop();
            }
            else if(stack.peek() == 'S' && curr == 'L'){
                count += 1;
                curr = 'S';
            }
            while(!stack.isEmpty() && (stack.peek() == 'R' && curr == 'S')){
                count += 1;
                stack.pop();
            }
            stack.push(curr);
        }
        return count;
    }
}