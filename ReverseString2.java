public class ReverseString2{
    public static void main(String args[]){
         String s = "abcdefg";
         int k = 2;
         System.out.println(reverseString2(s,k));
    }
    public static String reverseString2(String s, int k){
        char arr[] = s.toCharArray();
        for(int i = 0;i<arr.length;i += 2*k){
            int start = i;
            int end = Math.min(i+k-1,arr.length-1);
            reverseString(start,end,arr);
        }
        return new String(arr);
    }
    public static void reverseString(int start, int end, char arr[]){
        while(start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}