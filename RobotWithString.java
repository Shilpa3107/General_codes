import java.util.Stack;
public class RobotWithString{
    public static void main(String args[]){
        String s = "zza";
        System.out.println(robotWithString(s));
    }
    public static String robotWithString(String s){
        int freq[] = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            stack.push(ch);
            freq[ch-'a']--;
            if(!stack.isEmpty() && stack.peek() <= smallestChar(freq)){
                sb.append(stack.pop());
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    public static char smallestChar(int freq[]){
        for(int i = 0 ;i<26;i++){
            if(freq[i]>0)
              return (char)('a'+i);
        }
        return 'a';
    }
}