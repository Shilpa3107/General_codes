public class StringCompression{
    public static void main(String args[]){
        String word = "aaaaaaaaaaaaaabb";
        System.out.println(compression(word));
    }
    public static String compression(String word){
        String comp = "";
        int count = 1;
        char ch = word.charAt(0);
        for(int i = 1;i<word.length();i++){
            if(ch == word.charAt(i))
                count++;
            if(ch != word.charAt(i)){
                while(count >= 10){
                comp = comp+"9"+ch;
                count = count-9;
                }
                comp = comp+Integer.toString(count)+ch;
                count = 1;
                ch = word.charAt(i);
            }
        }
        while(count >= 10){
            comp = comp+"9"+ch;
            count = count-9;
        }
        comp = comp+Integer.toString(count)+ch;
        return comp;
    }
}