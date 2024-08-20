import java.util.*;
class GroupAnagram{
    public static void main(String args[]){

        String strs[] = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> listoflist = anagram(strs);
        System.out.println(listoflist);
    }
    public static List<List<String>> anagram(String strs[]){
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(String s: strs){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}