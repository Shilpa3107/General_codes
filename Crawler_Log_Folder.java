import java.util.*;
class Crawler_Log_Folder {
    public static void main(String args[]){
        String logs[] = {"d1/","d2/","../","d21/","./"};
        System.out.println(minOperations(logs));
    }
    @SuppressWarnings("unused")
    public static int minOperations(String[] logs) {
        Stack<String> stack = new Stack<String>();
        String temp = "";
        for(int i = 0;i<logs.length;i++){
            if(logs[i].equals("../") && stack.size() >= 1)
                stack.pop();
            else if(logs[i].equals("./") && stack.size()>=1)
                temp = stack.peek();
            else if(!(logs[i].equals("../")) && !(logs[i].equals("./")))
                stack.push(logs[i]);
        }
        //System.out.println(stack);
        int a = stack.size();
        return a;
    }
}