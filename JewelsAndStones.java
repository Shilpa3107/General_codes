class JewelsAndStones {
    public static void main(String args[]){
        String jewels = "aA";
        String stones = "aAAbbbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i = 0;i<jewels.length();i++){
            count += count(stones,jewels.charAt(i));
            //System.out.println(jewels.charAt(i)+" "+count);
        }
        return count;
    }
    public static int count(String stones, char ch){
        int count = 0;
        for(int i = 0;i<stones.length();i++){
            if(ch == stones.charAt(i))
                count++;
        }
        return count;
    }
}