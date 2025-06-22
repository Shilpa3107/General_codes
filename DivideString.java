import java.util.ArrayList;
class DivideString {
    public static void main(String args[]){
        String s = "abcdefghij";
        int k = 3;
        char fill = 'x';
        DivideString obj = new DivideString();
        String str[] = obj.divideString(s,k,fill);
        for(String s1 : str)
          System.out.print(s1+" ");
    }
    public String[] divideString(String s, int k, char fill) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0;i<s.length();i = i+k){
            if(i+k <= s.length())
               list.add(s.substring(i,i+k));
            else{
                list.add(s.substring(i));
            }
        }
        int len = list.get(list.size()-1).length();
        if(len < k)
           list.set(list.size()-1,list.get(list.size()-1)+String.valueOf(fill).repeat(k-len));

        String arr[] = new String[list.size()];
         for(int i =0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}