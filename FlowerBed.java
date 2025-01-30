public class FlowerBed{
    public static void main(String args[]){
        int flowerbed[] = {1,0,0,0,1};
        int n = 1;
        System.out.println(flowerBed(flowerbed,n));
    }
    public static boolean flowerBed(int flowerbed[], int n){
        if(flowerbed.length == 1 && n == 1)
         return flowerbed[0]==0?true:false;
        if(n==0)
        return true;
        if(flowerbed[0] == 0 && flowerbed[1] == 0 && n > 0){
            flowerbed[0] = 1;
            n--;
        }
        for(int i = 1;i<flowerbed.length-1;i++){
            if(flowerbed[i-1] != 1 && flowerbed[i+1] != 1 && flowerbed[i] ==0 && n >0){
                flowerbed[i] = 1;
                n--;
            }
            if(n==0)
            break;
        }
        if(flowerbed[flowerbed.length-2] != 1 && flowerbed[flowerbed.length-1] != 1 && n > 0){
            flowerbed[flowerbed.length-1] = 1;
            n--;
        }
        return n==0?true:false;
    }
}