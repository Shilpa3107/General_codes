import java.util.HashSet;
public class LetterTilePossibilities{
    public static void main(String args[]){
        String tiles = "AAB";
        System.out.println(letterTilePossibilities(tiles));
    }
    public static int letterTilePossibilities(String tiles){
       //created hashset to remove duplicates
       HashSet<String> set = new HashSet<>();

       backtrackLetter(set,tiles,new StringBuilder(), new boolean[tiles.length()]);

       //size of hashset will be number of sequences
       return set.size();
    }
    public static void backtrackLetter(HashSet<String> set, String tiles, StringBuilder sub, boolean used[]){
        if(sub.length() > 0)
          set.add(sub.toString());

        for(int i = 0;i<tiles.length();i++){

            //if not chosen the character
            if(!used[i]){

                //choose the character
                used[i] = true;

                //append the chosen character
                sub.append(tiles.charAt(i));

                //backtrack to get all combination for a particular character
                backtrackLetter(set,tiles,sub,used);

                //if not choose the character
                used[i] = false;

                //remove the character after getting its combination
                sub.deleteCharAt(sub.length()-1);
            }
        }
    }
}