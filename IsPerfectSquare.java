class IsPerfectSquare {
    public static void main(String args[]){
        int num = 14;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        if(num < 2)
            return true;
        int start = 2;
        int end = num;
        while(start <= end){
            int mid = start+(end-start)/2;
            long square = (long) mid * mid;
            if(square == num)
                return true;
            else if(square < num)
                start = mid+1;
            else
                end = mid-1;
        }
        return false;
    }
}