import java.util.ArrayList;
class ProductExceptSelf
{ 
	public static void main(String args[]){
		int nums[] = {10,3,5,6,2};
		long arr[] = productExceptSelf(nums,nums.length);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
	}
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long arr[] = new long[nums.length];
        
        for(int i = 0;i<nums.length;i++){
            arr[i] = calculate(check(nums,i));
        }
        return arr;
	} 
	public static ArrayList<Integer> check(int nums[],int k){
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for(int i = 0;i<nums.length;i++){
	        if(k!=i)
	        list.add(nums[i]);
	    }
	    return list;
	}
	public static long calculate(ArrayList<Integer> list){
	    long num = 1;
	    for(int i = 0;i<list.size();i++){
	        num = num*list.get(i);
	    }
	    return num;
	}
}