public class FancyString{
    public static void main(String args[]){
        String s = "leeetcode";
        System.out.println(fancyString(s));
    }
    public static String fancyString(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        int count = 1;
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i) == sb.charAt(sb.length()-1))
            {
                count++;
                if(count < 3)
                sb.append(s.charAt(i));
            }
            else {
                count = 1;
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}