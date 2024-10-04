import java.util.Arrays;
class DividePlayers {
    public static void main(String args[]){
        int skill[] = {3,2,5,1,3,4};
        System.out.println(dividePlayers(skill));
    }
    public static long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int c = skill[0]+skill[skill.length-1];
        long count = 0;
        count = skill[0]*skill[skill.length-1];
        if(skill.length == 2)
            return count;
        int left = 1;
        int right = skill.length-2;
        boolean check[] = new boolean[skill.length];
        check[0] = true;
        check[skill.length-1] = true;
        while(left < right){
            int sum = skill[left]+skill[right];
            if(sum == c){
                check[left] = true;
                check[right] = true;
                count += skill[left]*skill[right];
            }
            else if(sum != c){
                check[left] = false;
                check[right] = false;
            }
            left++;
            right--;
        }
        for(boolean flag : check){
            if(flag == false)
                return -1;
        }
        return count;
        
    }
}