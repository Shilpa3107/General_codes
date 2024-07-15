import java.util.*;
class Move_Zeros {
    public static void main(String args[]){
        int nums[] ={0,1,0,3,1,12};
        moveZeroes(nums);
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void moveZeroes(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i] !=0)
              list.add(nums[i]);
        }
        int b[] = new int[nums.length];
        for(int i = 0;i<list.size();i++){
            b[i] = list.get(i);
        }
        for(int i =list.size();i<nums.length;i++){
            b[i] = 0;
        }
        for(int i = 0;i<nums.length;i++){
            nums[i] = b[i];
        }
    }
}