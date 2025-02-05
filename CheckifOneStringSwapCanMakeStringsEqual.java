public class CheckifOneStringSwapCanMakeStringsEqual{
    public static void main(String args[]){
       String s1 = "bank";
       String s2 = "kanb";
       System.out.println(checkifOneStringSwapCanMakeStringsEqual(s1,s2));
    }
    public static boolean checkifOneStringSwapCanMakeStringsEqual(String s1, String s2){
         //create an array to store the elements
       char arr[] = s1.toCharArray();

       //declare ad intialize the variable to store the index of the element which is not equal
       int ind = -1;

       //traverse the array
       for(int i = 0;i<arr.length;i++){

        //defining the condition
        if(arr[i]!=s2.charAt(i)){

            //ind value has not intialized yet
            if(ind == -1)
              ind = i;

            //found the second index and swap it
            else{
                char temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
                return String.valueOf(arr).equals(s2);
            }
        }
       }

       //either both strings are equal or none of them
       return s1.equals(s2);
    }
}