class DifferenceOfSums {
    public static void main(String args[]){
          DifferenceOfSums obj = new DifferenceOfSums();
          System.out.println(obj.differenceOfSums(10,3));
    }
    public int differenceOfSums(int n, int m) {
        int num1 = 0, num2 = 0;
        for(int i = 1;i<=n;i++){
            if(i%m==0)
               num2 += i;
            else 
              num1 += i;
        }
        return num1-num2;
    }
}