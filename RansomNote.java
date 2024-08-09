import java.util.HashMap;
class RansomNote {
    public static void main(String args[]){
        String ransomNote = "a";
        String magazine = "b";
        System.out.println(canConstruct(ransomNote,magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
       HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(char ch: magazine.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:ransomNote.toCharArray()){
            if(!map.containsKey(ch) || map.get(ch) < 1)
                return false;
            map.put(ch,map.get(ch)-1);
        }
        return true;
    }
}