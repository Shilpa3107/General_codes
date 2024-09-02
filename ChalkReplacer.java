class ChalkReplacer {
    public static void main(String args[]){
        int chalk[] = {5,1,15};
        int k = 22;
        System.out.println(chalkReplacer(chalk,k));
    }
    public static int chalkReplacer(int[] chalk, int k) {
        int index = -1;
        int i = 0;
        while(index == -1){
            for(i = 0;i<chalk.length;i++){
               
                if(k < chalk[i]){
                    index = i;
                    break;
                }
                 k = k-chalk[i];
            }
            i = 0;
            
        }
        return index;
    }
}