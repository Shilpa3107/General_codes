import java.util.*;
public class DayName {

    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in);){
            System.out.println("Enter day number : ");
            int n = sc.nextInt();
            String day = "";
            switch(n){
                case 1: day = "Monday";
                break;
                case 2: day = "Tuesday";
                break;
                case 3: day = "Wednesday";
                break;
                case 4: day = "Thursday";
                break;
                case 5: day = "Friday";
                break;
                case 6: day = "Saturday";
                break;
                case 7: day = "Sunday";
                break;
                default: day = "Not a valid day number";
            }
            System.out.println(day);
        }
    }
}
