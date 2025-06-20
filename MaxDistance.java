class MaxDistance {
  public static void main(String args[]){
    MaxDistance obj = new MaxDistance();
    System.out.println(obj.maxDistance("NWSE",1));
  }
    public int maxDistance(String s, int k) {
        int n = 0, s1 = 0, w = 0, e = 0;
        int ans = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'N')
               n++;
            else if(ch == 'S')
               s1++;
            else if(ch == 'E')
              e++;
            else
              w++;

            int t1 = Math.min(k,Math.min(n,s1));
            int t2 = Math.min(k-t1,Math.min(e,w));

            ans = Math.max(ans,count(n,s1,t1)+count(e,w,t2));
        }
        return ans;
    }
    public int count(int d1, int d2, int t){
        return Math.abs(d1-d2)+t*2;
    }
}