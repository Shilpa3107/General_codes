import java.util.Stack;
public class ConstructString{
    public static void main(String args[]){
        String pattern = "IIIDIDDD";
        System.out.println(constructString(pattern));
    }
    public static String constructString(String pattern){

        //created stringbuilder to store the result
        StringBuilder result = new StringBuilder();

        //created stack to handle the D operation
        Stack<Integer> stack = new Stack<>();

        //traverse the array till pattern.length() to handle sequence
        for(int ind = 0;ind<=pattern.length();ind++){

            //push the elements
            stack.push(ind+1);

            if(ind == pattern.length() || pattern.charAt(ind) == 'I'){

                while(!stack.isEmpty()){
                    result.append(stack.pop());
                }
            }
        }
        return result.toString();
    }
}