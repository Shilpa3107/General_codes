import java.util.List;
import java.util.ArrayList;
class PositiveCumulativeSum {
	public static void main(String args[]){
		int arr[] = {1, -2, 3, 4, -6};
       List<Integer> list = getPositiveCumulativeSum(arr);
       for(int n: list)
       System.out.print(n+" ");
	}
	public static List<Integer> getPositiveCumulativeSum (int[] arr) {
		// add your logic here
		int sum = arr[0];
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1;i<arr.length;i++)
		{
			sum += arr[i];
			arr[i] = sum;
		}
		for(int n: arr){
			if(n > 0)
			list.add(n);
		}
		return list;
	}
}