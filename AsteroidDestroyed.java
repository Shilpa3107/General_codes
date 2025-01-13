import java.util.Arrays;
public class AsteroidDestroyed{
    public static void main(String args[]){
        int mass = 10;
        int asteroids[]={3,9,19,5,21};
        System.out.println(asteroidDestroyed(mass,asteroids));
    }
    public static boolean asteroidDestroyed(int mass , int asteroids[]){
        Arrays.sort(asteroids);
        long m = mass;
        for(int i = 0;i<asteroids.length;i++){
            if(m >= asteroids[i])
               m += asteroids[i];
            else 
              return false;
        }
        return true;
    }
}