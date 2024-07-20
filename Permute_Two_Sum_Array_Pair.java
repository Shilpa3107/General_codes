import java.util.*;
class Permute_Two_Sum_Array_Pair{
    public static void main(String args[]){
        int a[] = {2, 1, 3};
        int b[] = {7,8,9};
        int k = 10;
        System.out.println(check(a,b,k));
    }
    public static boolean check(int a[], int b[], int k){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int n: a){
            list.add(n);
        }
        Collections.sort(list,Collections.reverseOrder());
        for(int i = 0;i<list.size();i++){
            a[i] = list.get(i);
        }
        
        Arrays.sort(b);
        for(int i = 0;i<a.length;i++){
            if(a[i]+b[i] < k)
            return false;
        }
        return true;
    }
}