import java.util.ArrayList;
class ReverseString1 {
    public static void main(String args[]){
        String s = "IceCream";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
        //initialize a stringbuilder to make changes in the string as string is immutable
        StringBuilder sb = new StringBuilder(s);

        //create an array to store the indexes of vowels
        ArrayList<Integer> list = new ArrayList<>();

        //create a stringBuilder to store the vowels
        StringBuilder vowel = new StringBuilder();

        //traverse on string to find the indexes and append the vowels in stringBuilder
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='a' ||s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
            list.add(i);
            vowel.append(s.charAt(i)+"");
            }
        }
         
         //reverse the vowels
         vowel.reverse();

        //replacing characters at specified index
        for(int i = 0;i<list.size();i++){
            sb.setCharAt(list.get(i),vowel.charAt(i));
        }
         
         //returning the changed string
        return sb.toString();
    }
}