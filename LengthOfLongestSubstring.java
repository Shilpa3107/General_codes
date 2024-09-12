import java.util.HashSet;
class LengthOfLongestSubstring {
    public static void main(String args[]){
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() < 2)
            return s.length();
      int left = 0;
      int max = 0;
        HashSet<Character> set = new HashSet<Character>();
        for(int right = 0;right < s.length(); right++){
             while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
             }
                set.add(s.charAt(right));
                max = Math.max(max,right-left+1);
            }
        return max;
    }
}