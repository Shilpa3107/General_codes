class ThreeConsecutiveOdds {
    public static void main(String args[]){
        System.out.println(threeConsecutiveOdds(new int[]{2,6,4,1}));
    }
    public static boolean threeConsecutiveOdds(int[] arr) {
        for(int i = 1;i<arr.length-1;i++){
            if(arr[i-1]%2 != 0 && arr[i]%2!=0 && arr[i+1]%2!=0)
              return true;
        }
        return false;
    }
}