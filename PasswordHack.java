public class PasswordHack{
    public static void main(String args[]){
        String target = "ab@1";
        System.out.println(passwordHack(target));
    }
    public static String passwordHack(String target){
        char arr[] = {'a','b','c','d','e','f','g','h','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','@','#','$','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
       // int len = 4;
       for(int i = 0;i<arr.length;i++){
        StringBuilder s = new StringBuilder();
        s.append(arr[i]);
        for(int j = 1;j<arr.length;j++){
          s.append(arr[j]);
          for(int k = 2;k<arr.length;k++){
            s.append(arr[k]);
            for(int t = 3;t<arr.length;t++){
              s.append(arr[t]);
              if(s.length() == 4 && s.toString().equals(target))
               return s.toString();
              else{
                while(s.length() > 4){
                  s.deleteCharAt(s.length()-1);
                }
              }
                
              System.out.println("String : "+s); 
            }
          }
        
        }
       }
       return "";
}
}