import java.util.*;
class MyQueue {

    public static void main(String args[]){
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        int peek = obj.peek();
        int pop = obj.pop();
        boolean flag = obj.empty();

        System.out.println("Peek: "+peek);
        System.out.println("Pop: "+pop);
        System.out.println("Checking Emptiness : "+flag);

    }
    Stack<Integer> stack;
    public MyQueue() {
        stack = new Stack<Integer>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        if(!stack.isEmpty()){
           int x = stack.get(0);
           stack.remove(0);
            return x;
        }
        return -1;
    }
    
    public int peek() {
        if(!stack.isEmpty())
        {
            int x = stack.get(0);
            return x;
        }
        return -1;
    }
    
    public boolean empty() {
        if(stack.isEmpty())
            return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */