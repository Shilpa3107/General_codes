public class RemoveAllOccurrences{
    public static void main(String args[]){
        String s = "aabababa";
        String part = "aba";
        System.out.println(removeAllOccurrences(s,part));
    }
    public static String removeAllOccurrences(String s, String part){
        while(s.contains(part)){
            s = s.substring(0,s.indexOf(part))+s.substring(s.indexOf(part)+part.length());
        }
        return s;
    }
}