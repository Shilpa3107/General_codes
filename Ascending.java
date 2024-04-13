import java.util.*;
class Ascending {
    public static void main(String args[]){
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        System.out.println(areNumbersAscending(s));
    }
    public static boolean areNumbersAscending(String s) {
      String arr[] = new String[100];
        arr = s.split(" ");
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean flag = false;
        for(int i = 0;i<arr.length;i++){
            if(isNumeric(arr[i])){
                int n = Integer.parseInt(arr[i]);
                list.add(n);
            }
        }
        for(int i = 0;i<list.size()-1;i++){
            if(list.get(i) >= list.get(i+1)){
                flag = false;
                break;
            }
            else{
                flag = true;
                continue;
            }
        }
        return flag;
    }
    public static boolean isNumeric(String s){
        try{
            Integer.parseInt(s);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}