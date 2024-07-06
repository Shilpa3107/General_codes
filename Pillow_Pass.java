class Pillow_Pass {
    public static void main(String args[]){
        System.out.println(passThePillow(9,4));
    }
    public static int passThePillow(int n, int time) {
        boolean flag = true;
        int d = 1;
        while(time-->0){
            if(flag){
                d++;
                if(d == n)
                    flag = false;
            }
            else{
                d--;
                if(d == 1)
                    flag = true;
            }
        }
        return d;
    }
   
}