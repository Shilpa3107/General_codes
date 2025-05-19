import java.util.Arrays;
class Triangle{
  public static void main(String args[]){
    Triangle obj = new Triangle();
    System.out.println(obj.triangleType(new int[]{8,4,4}));
  }
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]+nums[1]<=nums[2])
           return "none";
        else if(nums[0]==nums[2])
          return "equilateral";
        else if(nums[0]==nums[1] || nums[1]==nums[2])
           return "isosceles";
        return "scalene";
    }
}