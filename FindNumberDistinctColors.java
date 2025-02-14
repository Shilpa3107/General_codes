import java.util.HashMap;
public class FindNumberDistinctColors{
    public static void main(String args[]){
        int limit = 4;
        int queries[][] = {{1,4},{2,5},{1,3},{3,4}};
        int result[] = findNumberDistinctColors(limit,queries);
        for(int n : result)
          System.out.print(n+" ");
    }
    public static int[] findNumberDistinctColors(int limit, int queries[][]){
        //create hashmap to store color with frequnecies
        HashMap<Integer, Integer> colorMap = new HashMap<>();

        //create hashmap to store ball with its color
        HashMap<Integer,Integer> ballMap = new HashMap<>();

        //create an array to store distinct color at each index
        int result[] = new int[queries.length];

        //traverse the array
        for(int i = 0;i<queries.length;i++){
            int ball = queries[i][0];
            int color = queries[i][1];

            //if ball has been color
            if(ballMap.containsKey(ball)){

                int prev = ballMap.get(ball);

                //decrement the frequency of the previous color
                colorMap.put(prev,colorMap.get(prev)-1);

                //if frequency of previous color is 0
                if(colorMap.get(prev) == 0)
                
                //remove it
                colorMap.remove(prev);
            }

            //add the ball and color
            ballMap.put(ball,color);

            colorMap.put(color,colorMap.getOrDefault(color,0)+1);

            //store distinct colors
            result[i] = colorMap.size();
        }
        return result;
    }
}