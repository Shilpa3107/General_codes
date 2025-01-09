public class CountingWords{
    public static void main(String args[]){
        String words[] = {"pay","attention","practice","attend"};
        String pref = "at";
        System.out.println(countingWords(words,pref));
    }
    public static int countingWords(String words[] , String pref){
        int count = 0;
        for(String s : words){
            if(pref.length() <= s.length() && pref.equals(s.substring(0,pref.length())))
              count++;
        }
        return count;
    }
}