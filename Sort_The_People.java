import java.util.*;
class Sort_The_People {
    public static void main(String args[]){
        String names[] = {"Alice","Bob","John"};
        int heights[] = {155,170,167};
        names = sortPeople(names,heights);
        for(int i = 0;i<names.length;i++){
            System.out.print(names[i]+" ");
        }
    }
    public static String[] sortPeople(String[] names, int[] heights) {
       HashMap<Integer,String> map = new HashMap<Integer,String>();
        for(int i = 0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int n : heights){
            list.add(n);
        }
        Collections.sort(list,Collections.reverseOrder());
        String arr[] = new String[names.length];
        
        ArrayList<String> list1 = new ArrayList<String>();
        for(int i = 0;i<list.size();i++){
            insert(map,list.get(i),list1);
        }
        int i = 0;
        for(String n: list1){
            arr[i] = n;
            i++;
        }
        //System.out.println(list1);
        return arr;
    }
    public static void insert(HashMap<Integer,String> map, int n, ArrayList<String> list){
         for(Map.Entry<Integer,String> mapEle: map.entrySet()){
            if(mapEle.getKey()==n){
                list.add(mapEle.getValue());
            }
        }
    } 
}