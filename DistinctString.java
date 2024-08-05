import java.util.*;
class DistinctString {
    public static void main(String args[]){
        String arr[] = {"d","b","c","b","c","a"};
        int k = 2;
        System.out.println(kthDistinct(arr,k)); 
    }
    public static String kthDistinct(String[] arr, int k) {
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0;i<arr.length;i++){
            if(count(arr,arr[i]) == 1){
                list.add(arr[i]);
            }
        }
        if((k-1)<= list.size() && list.size() !=0)
          return list.get(k-1);
        else 
            return "";
    }
    public static int count(String arr[] ,  String ch){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i].equals(ch))
                count++;
        }
        return count;
    }
}