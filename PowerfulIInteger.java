class PowerfullInteger{
  public static void main(String args[]){
    System.out.println(numberOfPowerfulInt(1,6000,4,"124"));
  }
    public static long numberOfPowerfulInt(long start, long finish, int limit, String s) {
       return count(finish,limit,s)-count(start-1,limit,s);

    }
    public static long count(long cap, int limit, String symbol){
        String flow = Long.toString(cap);
        int prefix = flow.length()-symbol.length();
        if(prefix<0)
          return 0;
          long[][] scroll = new long[prefix+1][2];
          scroll[prefix][0] = 1;
          scroll[prefix][1] = flow.substring(prefix).compareTo(symbol) >= 0?1:0;
          for(int i = prefix-1;i>=0;i--){
            int curr = flow.charAt(i)-'0';
            scroll[i][0] = (limit+1)*scroll[i+1][0];
            if(curr<=limit){
                scroll[i][1] = (long) curr*scroll[i+1][0]+scroll[i+1][1];
           }
           else{
            scroll[i][1] = (long)(limit+1)*scroll[i+1][0];
           }
          }
          return scroll[0][1];
    }
}