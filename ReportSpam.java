import java.util.HashSet;
class ReportSpam {
    public static void main(String args[]){
        String message[] = {"hello","world","leetcode"};
       String bannedWords[] ={"world","hello"};
       System.out.println(reportSpam(message,bannedWords));

    }
    public static boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> banword = new HashSet<String>();
        for(String s: bannedWords){
            banword.add(s);
        }
        int count = 0;
        for(int i = 0;i<message.length;i++){
            if(banword.contains(message[i]))
                count++;
            if(count == 2)
                return true;
        }
        return false;
    }
}