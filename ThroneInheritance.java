import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
public  class ThroneInheritance{
     static HashMap<String,ArrayList<String>> map = new HashMap<>();
     static HashSet<String> dead = new HashSet<>();
     static String king;
     public static void throneInheritance(String kingName){
        king = kingName;
        map.put(king,new ArrayList<>());
     }
     public static void birth(String parentName, String childName){
        map.computeIfAbsent(parentName,x->new ArrayList<>()).add(childName);
     }
     public static void dead(String name){
        dead.add(name);
     }
     public static List<String> getInheritanceOrder(){
        List<String> list = new ArrayList<>();
        dfs(list,king);
        return list;
     }
     public static void dfs(List<String> list, String root){
        if(!dead.contains(root))
          list.add(root);
        if(!map.containsKey(root))
          return;
        for(String s : map.get(root))
          dfs(list,s);
     }
     public static void main(String args[]){
        throneInheritance("king");
        birth("king","andy");
        birth("king","bob");
        birth("king","catherine");
        birth("andy","matthew");
        birth("bob","alex");
        birth("bob","asha");
        List<String> list = getInheritanceOrder();
        for(String s : list)
          System.out.print(s+"->");
        System.out.println();
        dead("bob");
        List<String> list1 = getInheritanceOrder();
        for(String s : list1)
          System.out.print(s+"->");
     }
}