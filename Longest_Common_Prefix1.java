import java.util.Arrays;
class Longest_Common_Prefix1 {
    public static void main(String args[]){
        String arr[] = {"geeks","gee","geeto"};
        System.out.println(longestCommonPrefix(arr));
    }
    public static String longestCommonPrefix(String arr[]) {
        // code here
        if(arr.length == 1)
        return arr[0];
        Arrays.sort(arr);
        String s1 = arr[0];
        String s2 = arr[arr.length-1];
        String match = "";
        for(int i = 0;i<Math.min(s1.length(),s2.length());i++){
            if(s1.charAt(i) == s2.charAt(i))
           match = match+s1.charAt(i);
            else
            break;
        }
        if(match.length()>0)
        return match;
        else 
        return "-1";
    }
}