public class RotateString{
    public static void main(String args[]){
        String s = "abcde" , goal = "cdeab";
        System.out.println(check(s,goal));
    }
    public static boolean check(String s, String goal){
        if(s.length() != goal.length())
           return false;
        String str = s+s;
        if(str.contains(goal))
          return true;
        return false;
    }
}