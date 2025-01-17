import java.util.List;
import java.util.ArrayList;
public class BitwiseXor1{
    public static void main(String args[]){
       int derived[] = {1,1,0};
       System.out.println(bitwiseXor(derived));
    }
    public static boolean bitwiseXor(int derived[]){
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list.add(0);
        list1.add(1);
        for(int i = 0;i<derived.length;i++){
            list.add(list.get(i)^derived[i]);
            list1.add(list1.get(i)^derived[i]);
        }
        if(list.get(list.size()-1)==list.get(0) || list1.get(list1.size()-1)==list1.get(0))
           return true;
        return false;
    }
}