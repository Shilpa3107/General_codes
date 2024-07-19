import java.util.*;
class LuckyNumbers {
    public static void main(String args[]){
        int matrix[][]={{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(matrix));
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
       ArrayList<Integer> maxList = new ArrayList<Integer>();
        ArrayList<Integer> minList = new ArrayList<Integer>();
        Rows(matrix,minList);
        Columns(matrix,maxList);
        List<Integer> list = new ArrayList<>();
        if(maxList.size()>minList.size())
        add(maxList,minList,list);
        else 
            add(minList,maxList,list);
        return list;
    }
    public static void add(ArrayList<Integer> list1, ArrayList<Integer> list2, List<Integer> list3){
        for(int i = 0;i<list1.size();i++){
            if(count(list2,list1.get(i)))
                list3.add(list1.get(i));
        }
    }
    public static boolean count(ArrayList<Integer> list, int c){
        for(int i = 0;i<list.size();i++){
            if(c == list.get(i))
                return true;
        }
        return false;
    }
    public static void Rows(int arr[][],ArrayList<Integer> minList){
        for(int i = 0;i<arr.length;i++){
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int j = 0;j<arr[i].length;j++){
                list.add(arr[i][j]);
            }
            Collections.sort(list);
            minList.add(list.get(0));
        }
    }
    // public static int minimum(ArrayList<Integer> list){
    //     int min = Integer.MAX_VALUE;
    //     for(int i = 0;i<list.size();i++){
    //         min = Math.min(min,list.get(i));
    //     }
    //     return min;
    // }
    public static void Columns(int arr[][], ArrayList<Integer> maxList){
        for(int i = 0;i<arr[0].length;i++){
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int j= 0;j<arr.length;j++){
                list.add(arr[j][i]);
            }
            Collections.sort(list);
            maxList.add(list.get(list.size()-1));
        }
    }
    // public static int Maximum(ArrayList<Integer> list){
    //     int max = Integer.MIN_VALUE;
    //     for(int i =0;i<list.size();i++){
    //         max = Math.max(max,list.get(i));
    //     }
    //     return max;
    // }
}