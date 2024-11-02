import java.util.ArrayList;
class CircularSentence {
    public static void main(String args[]){
        String sentence = "leetcode exercises sound delightful";
        System.out.println(isCircularSentence(sentence));
    }
    public static boolean isCircularSentence(String sentence) {
        if(sentence.charAt(0)!=sentence.charAt(sentence.length()-1))
            return false;
        else{
        ArrayList<String> list = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<sentence.length();i++){
            if(sentence.charAt(i) == ' '){
                list.add(sb.toString());
                sb.setLength(0);
            }
            else 
                sb.append(sentence.charAt(i));
        }
            list.add(sb.toString());
        for(int i = 0;i<list.size()-1;i++){
            if(list.get(i).charAt(list.get(i).length()-1) != list.get(i+1).charAt(0))
                return false;
        }
             return true;
       }
    }
}