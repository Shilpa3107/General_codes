import java.util.List;
import java.util.ArrayList;
class LexicalOrder {
    public static void main(String args[]){
        LexicalOrder obj = new LexicalOrder();
        System.out.println(obj.lexicalOrder(13));
    }
    public List<Integer> lexicalOrder(int n) {
          List<Integer> list = new ArrayList<Integer>();
        for(int i = 1;i<=9;i++){
            generate(i,n,list);
        }
        return list;
    }
     public void generate(int start, int limit, List<Integer> list){
        if(start > limit)
            return;
        list.add(start);
        for(int i = 0;i<=9;i++){
            int nextnumber = start*10+i;
            if(nextnumber <= limit)
                generate(nextnumber,limit,list);
            else 
                break;
        }
     }
}