import java.util.Stack;
class MinSwaps {
    public static void main(String args[]){
        String s = "][][][[][]";
        System.out.println(minSwaps(s));
    }
    public static int minSwaps(String s) {
        Stack<Character> stack = new Stack<Character>();
        int unbalanced = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '[')
                stack.push(s.charAt(i));
            else{
                if(!stack.isEmpty())
                    stack.pop();
                else 
                    unbalanced++;
            }
        }
        return (unbalanced+1)/2;
    }
}