import java.util.List;
import java.util.ArrayList;
public class CourseSchedule{
    public static void main(String args[]){
       int numCourse = 3;
       int prerequisties[][] = {{1,2},{1,0},{2,0}};
       int queries[][] = {{1,0},{1,2}};
       List<Boolean> list = courseSchedule(numCourse,prerequisties,queries);
       System.out.println(list);
    }
    public static List<Boolean> courseSchedule(int numCourse, int prerequisties[][], int queries[][]){
        boolean pre[][] = new boolean[numCourse][numCourse];
        for(int n[] : prerequisties)
           pre[n[0]][n[1]] = true;
        for(int i = 0;i<numCourse;i++){
            for(int j = 0;j<numCourse;j++){
                for(int k = 0;k<numCourse;k++){
                    if(pre[j][i] && pre[i][k])
                      pre[j][k] = true;
                }
            }
        }
        List<Boolean> list = new ArrayList<>();
        for(int n[] : queries)
           list.add(pre[n[0]][n[1]]);
        return list;
    }
}