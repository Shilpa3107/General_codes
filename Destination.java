import java.util.*;
class Destination {
    public static void main(String args[]){
        List<List<String>> paths = Arrays.asList(
                Arrays.asList("London", "New York"),
                Arrays.asList("New York" , "Lima"),
                Arrays.asList("Lima", "Sao Paulo")
        );
      System.out.println(destCity(paths));
    }
    public static String destCity(List<List<String>> paths) {
       ArrayList<String> list1 = new ArrayList<String>();
        for(List<String> lists : paths){
            for(String k: lists){
                list1.add(k);
            }
        }
        String arr[] = new String[list1.size()];
        for(int i =0;i<list1.size();i++){
            arr[i] = list1.get(i);
        }
        Arrays.sort(arr);
        String s = "a";
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0;i<arr.length;i++){
            if(count(arr,arr[i]) <= 1)
                list.add(arr[i]);
                
        }
        for(List<String> list2: paths){
            for(int i = 0;i<list.size();i++){
                if(list.get(i).equals(list2.get(1))){
                    s = list.get(i);
                    break;
                }
            }
        }
        return s;
        
    }
    public static int firstoccurence(String arr[], String target){
        int start = 0;
        int end = arr.length-1;
        int res = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            int x = target.compareTo(arr[mid]);
            if(x==0){
                res = mid;
                end = mid-1;
            }
            else if(x > 0){
                start = mid+1;
            }
            else 
                end = mid-1;
        }
        return res;
    }
    public static int lastoccurence(String arr[], String target){
        int start = 0;
        int end = arr.length-1;
        int res = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            int x = target.compareTo(arr[mid]);
            if(x==0){
                res = mid;
                start = mid+1;
            }
            else if(x > 0){
                start = mid+1;
            }
            else 
                end = mid-1;
        }
        return res;
    }
    public static int count(String arr[], String target){
        int count = lastoccurence(arr,target)-firstoccurence(arr,target)+1;
        return count;
    }
}