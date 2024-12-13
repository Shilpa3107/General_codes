public class LongestPrefix{
    public static void main(String args[]){
        String strs[] = {"flower","flow","flight"};
        System.out.println(longestPrefix(strs));
    }
    public static String longestPrefix(String strs[]){
        StringBuilder sb = new StringBuilder(strs[0]);
        for(int i = 1;i<strs.length;i++){
            for(int j = 0;j<Math.min(strs[i].length(),sb.length());j++){
                if(sb.charAt(j) != strs[i].charAt(j)){
                    sb.setLength(j);
                    break;
                }
            }
            sb.setLength(Math.min(sb.length(),strs[i].length()));
        }
        return sb.toString();
    } 
}