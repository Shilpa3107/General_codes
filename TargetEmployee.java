import java.util.Arrays;
class TargetEmployee {
    public static void main(String args[]){
      int hours[] = {0,1,2,3,4};
      int target = 2;
      System.out.println(numberOfEmployeesWhoMetTarget(hours,target));
    }
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        Arrays.sort(hours);
        int count = 0;
        for(int i = 0;i<hours.length;i++){
            if(hours[i] >= target)
                count++;
        }
        return count;
    }
}