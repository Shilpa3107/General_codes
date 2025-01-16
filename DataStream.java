public class DataStream{
     int value, k;
     int count = 0;
    public static void main(String args[]){
        DataStream obj = new DataStream();
       obj.initialize(4,3);
       System.out.println(obj.consec(4));
       System.out.println(obj.consec(4));
       System.out.println(obj.consec(4));
       System.out.println(obj.consec(3));
    }
    public void initialize(int value, int k){
        this.value = value;
        this.k = k;
    }
    public  boolean consec(int num){
        if(value == num)
          count++;
        else 
          count = 0;
        return count >= k;
    }
}