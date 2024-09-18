import java.util.Arrays;
class LargestNumber{
    public static void main(String args[]){
        int nums[] = {3,30,34,5,9};
        System.out.println(largestNumber(nums));
    }
    public static String largestNumber(int[] nums) {
        String str[] = new String[nums.length];
        for(int i= 0 ;i<nums.length;i++){
            str[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));
        if(str[0].equals("0"))
            return "0";
        StringBuilder sb = new StringBuilder();
        for(String s: str)
            sb.append(s);
        return sb.toString();
    }
}