 public class ValidAnagram{
    public static void main(String args[]){
        String s = "anagram";
        String t = "nagaram";
        System.out.println(validAnagram(s,t));
    }
    public static boolean validAnagram(String s, String t){
        int freqs[] = new int[26];
        int freqt[] = new int[26];
        for(char ch : s.toCharArray()){
            freqs[ch-'a']++;
        }
        for(char ch : t.toCharArray()){
            freqt[ch-'a']++;
        }
        for(int i = 0;i<26;i++){
            if(freqs[i] != freqt[i])
              return false;
        }
        return true;
    }
 }