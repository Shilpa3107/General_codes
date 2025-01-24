public class PreorderSerialization{
    public static void main(String args[]){
       String preorder = "9,3,4,#,#,1,#,#,2,#,6,#,#";
       System.out.println(preorderSerialization(preorder));
    }
    public static boolean preorderSerialization(String preorder){
        String s[] = preorder.split(",");
        int diff = 1;
        for(String str : s){
            if(--diff<0)
              return false;
            if(!str.equals("#"))
              diff += 2;
        }
        return diff == 0;
    }
}