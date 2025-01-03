import java.util.HashMap;
public class BullAndCow{
    public static void main(String args[]){
         String secret = "1123";
         String guess = "0111";
         System.out.println(bullAndCow(secret,guess));
    }
    public static String bullAndCow(String secret , String guess){
        int bull = 0 , cow = 0;
        HashMap<Character,Integer> secretfreq = new HashMap<Character,Integer>();
        HashMap<Character,Integer> guessfreq = new HashMap<Character,Integer>();
        for(int i = 0;i<secret.length();i++){
            if(secret.charAt(i) == guess.charAt(i))
               bull++;
            else{
                secretfreq.put(secret.charAt(i),secretfreq.getOrDefault(secret.charAt(i),0)+1);
                guessfreq.put(guess.charAt(i),guessfreq.getOrDefault(guess.charAt(i),0)+1);
            }
        }
        for(char s : secretfreq.keySet()){
            if(guessfreq.containsKey(s)){
                int min = secretfreq.get(s);
                min = Math.min(min,guessfreq.get(s));
                cow += min;
            }
        }
        String s = Integer.toString(bull)+"A"+Integer.toString(cow)+"B";
        return s;
    }
}