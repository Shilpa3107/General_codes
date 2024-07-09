import java.util.ArrayList;
class Avg_Waiting_Time {
    public static void main(String args[]){
        int customers[][] = {{2,3},{6,3},{7,5},{11,3},{15,2},{18,1}};
        System.out.println(averageWaitingTime(customers));
    }
    public static double averageWaitingTime(int[][] customers) {
        ArrayList<Double> list = new ArrayList<Double>();
        double sum = customers[0][0]+customers[0][1];
        double a = 0.0;
        if(customers.length <= 1){
            sum = sum-customers[0][0];
            a = sum/customers.length;
        }
        if(customers.length > 1){
        list.add(sum);
        for(int i = 1;i<customers.length;i++){
            if(list.get(i-1) >= customers[i][0]){
                sum = list.get(i-1)+customers[i][1];
                 list.add(sum);
            }
            else{
                double k = customers[i][0]+customers[i][1];
                 list.add(k);
            }
            
        }
            sum = 0;
            for(int i = 0;i<customers.length;i++){
                
                sum = sum+(list.get(i)-customers[i][0]);
                System.out.println(list.get(i)-customers[i][0]);
            }
            a = sum/customers.length;
        }
        System.out.println(list+" "+sum);
         
        return a;
    }
}