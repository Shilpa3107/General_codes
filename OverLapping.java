public class OverLapping{
    public static void main(String args[]){
        int radius = 1, xCenter = 0, yCenter = 0, x1 = 1, y1 = -1, x2 = 3, y2 =1;
        System.out.println(overLapping(radius, xCenter, yCenter, x1, y1, x2, y2));
    }
    public static boolean overLapping(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2){
        return (clamp(xCenter,x1,x2)-xCenter)*(clamp(xCenter, x1, x2)-xCenter)+(clamp(yCenter,y1,y2)-yCenter)*(clamp(yCenter,y1,y2)-yCenter) <= radius*radius;
    }
    public static int clamp(int value, int min, int max){
        return Math.max(min,Math.min(value,max));
    }
}