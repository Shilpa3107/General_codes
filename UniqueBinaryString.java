import java.util.List;
import java.util.ArrayList;
public class UniqueBinaryString{
    public static void main(String args[]){
          String nums[] = {"01","10"};
          System.out.println(uniqueBinaryString(nums));
    }
    public static String uniqueBinaryString(String nums[]){

        //created list to store the defined binary string
        List<String> list = new ArrayList<>();

        //traverse the array to store elements in the list
        for(String s : nums)
          list.add(s);

        return generateSequence(list,nums[0].length(), "01",new StringBuilder());
    }
    //generate possible sequence
    public static String generateSequence(List<String> list, int n , String s , StringBuilder sb){

        //check if the string is of desired length and it is not present in the list if not present then that will be unique string otherwise continue
        if(sb.length() == n){
            if(!list.contains(sb.toString())){
                list.add(sb.toString());
                return sb.toString();
            }
            return null; //to continue generating
        }

        for(int i = 0;i<s.length();i++){
            sb.append(s.charAt(i));
            String result = generateSequence(list,n,s,sb);
            sb.deleteCharAt(sb.length()-1);

            if(result != null)
              return result;
        }

        return null;
    }
}