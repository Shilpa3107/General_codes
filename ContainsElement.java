class ContainsElement {
	public static void main(String args[]){
		int arr[] = {1,2,3,3,3,4,4,5};
		int key = 2;
		System.out.println(containsElement(arr,key));
	}
	public static boolean containsElement (int[] arr, int key) {
		// add your logic here
		int start = 0;
		int end = arr.length-1;
		while(start <= end){
			int mid = start+(end-start)/2;
			if(arr[mid] == key)
				return true;
			else if(arr[mid] < key)
				start = mid+1;
			else 
				end = mid-1;
		}
		return false;
	}
}