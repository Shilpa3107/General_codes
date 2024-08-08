import java.util.ArrayList;
import java.util.List;
class SummaryRanges {
    public static void main(String args[]){
        int nums[] = {0,1,2,4,5,7};
        List<String> list = new ArrayList<>();
        list = summaryRanges(nums);
        for(String s: list){
            System.out.print(s+" ");
        }
    }
    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<String>();
        if(nums.length == 0)
            return list;
        
        int start = nums[0];
        int res = nums[0];
       for(int i = 1;i<nums.length;i++){
            if(nums[i] == nums[i-1]+1){
                res = nums[i];
            }
            else {
                if(start!=res)
               list.add(Integer.toString(start)+"->"+Integer.toString(res));
                else 
                    list.add(Integer.toString(start));
               start = nums[i];
                res = nums[i];
            }
        }
         if(start!=res)
               list.add(Integer.toString(start)+"->"+Integer.toString(res));
                else 
                    list.add(Integer.toString(start));
        
        return list;
    }
}