class CumulativeSum{
	public static void main(String args[]){
		int arr[] = {1,2,3,4};
		arr = getCumulativeSum(arr);
		for(int n: arr)
		System.out.print(n+" ");
	}
	public static int[] getCumulativeSum (int[] arr) {
		// add your logic here
		int sum = arr[0];
		for(int i = 1;i<arr.length;i++){
			sum += arr[i];
			arr[i] = sum;
		}
		return arr;
	}
}