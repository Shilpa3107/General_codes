class ExceptionHandling3{
    public static void main(String args[]){
        try{
            try{
                int a = 8;
                int b = 0;
                int c = a/b;
                System.out.println("c = "+c);
            }
            catch(ArithmeticException e){
                System.out.println("Arithmetic Exception Occured");
            }
            try{
                int arr[] = new int[3];
                for(int i =0;i<=3;i++){
                    arr[i] = i;
                }
            }
             catch(ArrayIndexOutOfBoundsException e ){
                    System.out.println("ArrayIndexOutOfBounds Exception Occured");
            }
    }
    catch(Exception e){
        System.out.println("Other excpetions : "+e);
    }
    }
}