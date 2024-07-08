import java.util.ArrayList;
class Max_Subarray{
    public static void main(String args[]){
        int arr[] = new int[5];
        for(int i= 0;i<5;i++){
            arr[i] = i+1;
        }
        ArrayList<ArrayList<Integer>> listofLists = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        int t = 3;
        int k = 0;
        int sum = 0;
        for(int i = 0;i<=arr.length-t;i++){
            ArrayList<Integer> list = new ArrayList<Integer>();
            while(k < t){
                list.add(arr[i+k]);
                sum = sum+arr[i+k];
                k++;
            }
            list2.add(sum);
            listofLists.add(list);
            k = 0;
            sum = 0;
        }
        int max = Integer.MIN_VALUE;
        for(int i : list2){
            max = Math.max(max,i);
        }
        System.out.println(listofLists+" "+list2+" "+max);
    }
}