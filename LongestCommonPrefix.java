import java.util.Arrays;
class LongestCommonPrefix {
    public static void main(String args[]){
        String strs[] = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String strs[]) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        for(int i = 0;i<Math.min(s1.length(),s2.length());i++){
            if(s1.charAt(i) == s2.charAt(i))
                sb.append(s1.charAt(i));
            else{
                break;
            }
        }
        return sb.toString();
    }  
}