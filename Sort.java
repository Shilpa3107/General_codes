import java.util.*;
class Sort {
    public static void main(String args[]){
        String names[] = {"Mary","John","Emma"};
        int heights[] = {180,165,170};
        String sort[] = sortPeople(names,heights);
        for(int i = 0;i<sort.length;i++)
       System.out.print(sort[i]+" ");
    }
    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        for(int i = 0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        ArrayList<Integer> list = new ArrayList<Integer>(map.keySet());
        Collections.sort(list, Collections.reverseOrder());
        String arr[] = new String[names.length];
        int i =0;
        for(int h: list){
            arr[i] = map.get(h);
            i++;
        }
        return arr;
    }
   
}