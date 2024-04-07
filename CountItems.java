import java.util.ArrayList;
import java.util.List;
class CountItems {
    public static void main(String args[]){
        ArrayList<List<String>> items = new ArrayList<List<String>>();
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("phone");
        list1.add("blue");
        list1.add("pixel");
        items.add(list1);
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("computer");
        list2.add("silver");
        list2.add("lenovo");
        items.add(list2);
        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("phone");
        list3.add("gold");
        list3.add("iphone");
        items.add(list3);
        String ruleKey = "color", ruleValue = "silver";
        System.out.println(countMatches(items,ruleKey,ruleValue));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(List<String> list: items){
            count = count(list,ruleValue,ruleKey,count);
           // System.out.println(list+" "+rules(ruleKey));
        }
        
        return count;
    }
    public static int count(List<String> list , String ruleValue, String ruleKey, int count){
        int index = rules(ruleKey);
        if(list.get(index).equals(ruleValue))
            count++;
        return count;
    }
    public static int rules(String ruleKey){
        if(ruleKey.equals("type"))
            return 0;
        else if(ruleKey.equals("color"))
            return 1;
        else 
            return 2;
    }
}