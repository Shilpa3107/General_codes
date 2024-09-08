class BinaryDate {
    public static void main(String args[]){
        String date = "2020-07-31";
        System.out.println(convertDateToBinary(date));
    }
    public static String convertDateToBinary(String date) {
        String s = "";
        String k = "";
        for(int i = 0;i<date.length();i++){
            if(date.charAt(i) != '-')
            k = k+date.charAt(i);
            if(date.charAt(i)=='-' || i == date.length()-1){
                s = s+binary(k)+'-';
                k = "";
            }            
        }
        return s.substring(0,s.length()-1);
        
    }
    public static String binary(String d){
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(d);
        while(n > 0){
            sb.append(Integer.toString(n%2));
            n = n/2;
        }
        sb.reverse();
        return sb.toString();
    }
}