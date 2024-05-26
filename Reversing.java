public class Reversing {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        int b[] = new int[a.length];
        int i = 0,j = a.length-1;
        while(i<a.length){
            b[i] = a[j];
            i++;
            j--;
        }
        for(int x: b)
        System.out.print(x+" ");
    }
}
