class SearchOnRotatedArray {
    public static void main(String args[]){
        int nums[] = {4,5,6,0,1,2,3};
        int target = 2;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
     int start = minimum(nums);
     int end = nums.length-1;
     int result1 = search(nums,target,start,end);
     int result2 = search(nums,target,0,start);
     if(result1 != -1)
         return result1;
     return result2;
    }
    public static int search(int nums[], int target, int s, int e){
       while(s <= e){
           int mid = s+(e-s)/2;
           if(nums[mid] == target)
               return mid;
           else if(nums[mid] < target)
               s = mid+1;
           else 
               e = mid-1;
       }
        return -1;        
    }
    public static int minimum(int nums[]){
        int start = 0;
        int end = nums.length-1;
        while(start < end){
            int mid = start+(end-start)/2;
            if(nums[mid] > nums[end])
                start = mid+1;
            else 
                end = mid;
        }
        return start;
    }
    
}