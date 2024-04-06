import java.util.*;

class Bits {
    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(10);
        nums.add(1);
        nums.add(5);
        nums.add(2);
        int k = 1;
        System.out.println(sumIndicesWithKSetBits(nums,k));
    }
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<nums.size();i++){
            String s = Integer.toBinaryString(i);
            list.add(Integer.parseInt(s));
        }
        ArrayList<Integer> index = new ArrayList<Integer>();
        for(int i = 0;i<list.size();i++){
            if(count(list.get(i)) == k)
                index.add(i);
        }
        int sum = 0;
        for(int i = 0;i<index.size();i++){
            sum += nums.get(index.get(i));
        }
        return sum;
    }
    public static int count(int num){
       int sum = 0;
        while(num > 0){
            int dig = num%10;
            sum = sum+dig;
            num = num/10;
        }
        return sum;
    }
}