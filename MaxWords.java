import java.util.ArrayList;

class MaxWords {
    public static void main(String args[]){
        String[] sentences = {"alice and bob love leetcode","i think so too","this is great thanks very much"};
        mostWordsFound(sentences);
    }
    public static int mostWordsFound(String[] sentences) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<sentences.length;i++){
            String str = sentences[i];
            String[] arr = str.split(" ");
            list.add(arr.length);
        }
        int max = Integer.MIN_VALUE;
        for(int i= 0;i<list.size();i++){
            max = Math.max(max,list.get(i));
        }
        return max;
        
    }
}