import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class SmallestEquivalentString {
  public static void main(String args[]){
    String s1 = "parker";
    String s2 = "morris";
    String baseStr = "parser";
    SmallestEquivalentString obj = new SmallestEquivalentString();
    System.out.println(obj.smallestEquivalentString(s1,s2,baseStr));
  }
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        List<List<Character>> list = new ArrayList<>();
        List<Character> firstList = new ArrayList<>();
        firstList.add(s1.charAt(0));
        firstList.add(s2.charAt(0));
        Collections.sort(firstList);
        list.add(firstList);

        for (int i = 1; i < s1.length(); i++) {
            check(list, s1.charAt(i), s2.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        for (char ch : baseStr.toCharArray()) {
            boolean found = false;
            for (List<Character> l : list) {
                if (l.contains(ch)) {
                    result.append(l.get(0)); // use the smallest (sorted) char
                    found = true;
                    break;
                }
            }
            if (!found) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public void check(List<List<Character>> list, char ch1, char ch2) {
        List<Character> group1 = null, group2 = null;

        for (List<Character> group : list) {
            if (group.contains(ch1)) group1 = group;
            if (group.contains(ch2)) group2 = group;
        }

        if (group1 != null && group2 != null && group1 != group2) {
            group1.addAll(group2);
            Collections.sort(group1);
            list.remove(group2);
        } else if (group1 != null) {
            if (!group1.contains(ch2)) group1.add(ch2);
            Collections.sort(group1);
        } else if (group2 != null) {
            if (!group2.contains(ch1)) group2.add(ch1);
            Collections.sort(group2);
        } else {
            List<Character> newGroup = new ArrayList<>();
            newGroup.add(ch1);
            newGroup.add(ch2);
            Collections.sort(newGroup);
            list.add(newGroup);
        }
    }
}
