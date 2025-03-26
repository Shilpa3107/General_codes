public class FirstLastPosition{
    public static void main(String args[]){
          int nums[] = {5,7,7,8,8,9,10};
          int target = 8;
          int result[] = firstLastPosition(nums,target);
          System.out.println(result[0]+" "+result[1]);
    }
    public static int[] firstLastPosition(int nums[], int target){
         return new int[]{firstPosition(nums,target),lastPosition(nums,target)};
    }
    public static int firstPosition(int nums[], int target){
        int start = 0, end = nums.length-1, res = -1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                res = mid;
                end = mid-1;
            }
            else if(nums[mid] > target)
              end = mid-1;
            else 
              start = mid+1;
        }
        return res;
    }
    public static int lastPosition(int nums[], int target){
        int start = 0, end = nums.length-1, res = -1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                res = mid;
                start = mid+1;
            }
            else if(nums[mid] > target)
              end = mid-1;
            else 
              start = mid+1;
        }
        return res;
    }
}