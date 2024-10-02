class CanArrange {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,10,6,7,8,9};
        int k = 5;
        System.out.println(canArrange(arr,k));
    }
    public static boolean canArrange(int[] arr, int k) {
        int count = 0;
        boolean check[] = new boolean[arr.length];
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(!check[j] && !check[i] && (arr[i]+arr[j])%k == 0){
                    count++;
                    check[i] = true;
                    check[j] = true;
                }
            }
        }
        if(count == (int)arr.length/2)
            return true;
        return false;
    }
}