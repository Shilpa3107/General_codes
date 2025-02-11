public class AllOccurrences{
    public static void main(String args[]){
       String s = "aabababa";
       String part = "aba";
       System.out.println(allOccurences(s,part));
    }
    public static String allOccurences(String s, String part){
        //finding the first occurrence
        while(s.indexOf(part) != -1){
            
            //created to manipulate the string
            StringBuilder sb = new StringBuilder(s);

            //delete the first occurrence
            sb.delete(s.indexOf(part),s.indexOf(part)+part.length());

            //storing the actual result
            s = sb.toString();
        }
        return s;
    }
}