import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;
class CountConsistentStrings {
    public static void main(String args[]){
        String allowed = "cad";
        String words[] = {"cc","acd","b","ba","bac","bad","ac","d"};
        System.out.println(countConsistentStrings(allowed,words));

    }
    public static int countConsistentStrings(String allowed, String[] words) {
      int count = 0;
        for(int i = 0;i<words.length;i++){
            if(check(words[i],allowed))
                count++;
        }
        return count;
    }
    public static boolean check(String word, String allowed){
        HashSet<Character> set = new HashSet<Character>();
        for(char ch: word.toCharArray()){
            set.add(ch);
        }
        ArrayList<Character> list = new ArrayList<Character>(set);
        char arr[] = allowed.toCharArray();
        Arrays.sort(arr);
        for(char ch : list){
            if(binarySearch(arr,ch) == -1)
                return false;
        }
        return true;
        
    }
    public static int binarySearch(char arr[], char ch){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid] == ch)
                return mid;
            else if(arr[mid] < ch)
                start = mid+1;
            else 
                end = mid-1;
        }
        return -1;
    }
}
