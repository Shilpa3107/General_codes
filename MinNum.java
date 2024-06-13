public class MinNum {
public static void main(String args[]){
    int seats[] = {3,1,5};
    int students[] = {2,7,4};
    System.out.println(minMovesToSeat(seats,students));
}
public static int minMovesToSeat(int[] seats, int[] students) {
        int count1[] = new int[200];
        int count2[] = new int[200];
        for(int i = 0;i<seats.length;i++){
            ++count1[seats[i]];
            ++count2[students[i]];
        }
        for(int i = 1;i<200;i++){
            count1[i] = count1[i]+count1[i-1];
            count2[i] = count2[i]+count2[i-1];
        }
        int seats1[] = new int[seats.length];
        int students1[] = new int[students.length];
        for(int i = seats.length-1;i>=0;i--){
              seats1[--count1[seats[i]]] = seats[i];
              students1[--count2[students[i]]] = students[i];
        }
        int count = 0;
        for(int i = 0;i<seats.length;i++){
            count = count+Math.abs(seats1[i]-students1[i]);
        }
        return count;
    }
}
