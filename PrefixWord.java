public class PrefixWord{
    public static void main(String args[]){
        String sentence = "i love burger";
        String searchWord = "burg";
        System.out.println(check(sentence,searchWord));
    }
    public static int check(String sentence, String searchWord){
        String arr[] = sentence.split(" ");
        for(int i = 0;i<arr.length;i++){
            if(arr[i].length() >= searchWord.length() && arr[i].substring(0,searchWord.length()).equals(searchWord))
               return i+1;
        }
        return -1;
    }
}