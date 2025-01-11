public class MaximumProductDisjointSubsequences{
    public static void main(String args[]){
       String s = "leetcodecom";
       System.out.println(maximumProductDisjointSubsequences(s));
    }
    static int max = 0;
    public static int maximumProductDisjointSubsequences(String s){
        char ch[] = s.toCharArray();
        dfs(ch,0,"","");
        return max;
    }
    public static void dfs(char ch[], int i , String s1, String s2){
        if(i >= ch.length){
            if(isPalin(s1) && isPalin(s2))
              max = Math.max(max,s1.length()*s2.length());
            return;
        }
        dfs(ch,i+1,s1+ch[i],s2);
        dfs(ch,i+1,s1,s2+ch[i]);
        dfs(ch,i+1,s1,s2);
    }
    public static boolean isPalin(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if(sb.toString().equals(s))
          return true;
        return false;
    }
}