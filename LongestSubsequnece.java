import java.util.HashSet;
import java.util.Set;
public class LongestSubsequnece{
    public static void main(String args[]){
        String s = "abcabcbb";
        System.out.println(sequnece(s));
    }
    public static int sequnece(String s){
        Set<Character> charSet = new HashSet<Character>();
        int left = 0;
        int max = 0;
        for(int right = 0;right<s.length();right++){
            if(!charSet.contains(s.charAt(right))){
                charSet.add(s.charAt(right));
                max = Math.max(max,right-left+1);
            }
            else{
                while(charSet.contains(s.charAt(right))){
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        return max;
    }
}