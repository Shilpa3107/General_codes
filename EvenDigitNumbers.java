import java.util.List;
import java.util.ArrayList;
class EvenDigitNumbers {
	public static void main(String args[]){
		int arr[] = {42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442};
		List<Integer> list = getEvenDigitNumbers(arr);
		for(int n: list)
		System.out.print(n+" ");
	}
	public static List<Integer> getEvenDigitNumbers (int[] arr) {
		// add your logic here
		List<Integer> list = new ArrayList<Integer>();
		for(int n: arr){
			if(check(n))
				list.add(n);
		}
		return list;
	}
	public static boolean check(int n){
		String s = Integer.toString(n);
		if(s.length()%2==0)
			return true;
		else 
			return false;
	}
}