import java.util.Stack;
public class ValidPalindromeString{
    public static void main(String args[]){
         String s = "))()))";
         String locked = "010100";
         System.out.println(validPalindromeString(s,locked));
    }
    public static boolean validPalindromeString(String s , String locked){
        if(s.length()%2 != 0)
          return false;
        Stack<Integer> openInd = new Stack<>();
        Stack<Integer> unlockInd = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(locked.charAt(i)=='0')
              unlockInd.add(i);
            else if(s.charAt(i) == '(')
              openInd.add(i);
            else{
                if(!openInd.isEmpty())
                  openInd.pop();
                else if(!unlockInd.isEmpty())
                  unlockInd.pop();
                else 
                  return false;
            }
        }
        while(!openInd.isEmpty() && !unlockInd.isEmpty() && openInd.peek() < unlockInd.peek()){
            openInd.pop();
            unlockInd.pop();
        }
        if(openInd.isEmpty() && !unlockInd.isEmpty())
          return unlockInd.size()%2 == 0;
        return true;
    }
}