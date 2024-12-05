public class AddingSpace{
    public static void main(String args[]){

        String s = "LeetcodeHelpsMeLearn";
        int spaces[] = {8,13,15};
        System.out.println(check(s,spaces));
    }
    public static String check(String s, int spaces[]){
        StringBuilder sb = new StringBuilder();
        int prev = 0;
        for(int space : spaces){
            sb.append(s,prev,space);
            sb.append(" ");
            prev = space;
        }
        sb.append(s.substring(prev));
        return sb.toString();
    }
}