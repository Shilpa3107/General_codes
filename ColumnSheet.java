public class ColumnSheet{
    public static void main(String args[]){
        String column = "AB";
        System.out.println(columnSheet(column));
    }
    public static int columnSheet(String column){
        int res = 0;
        for(int i = 0;i<column.length();i++){
            int val = column.charAt(i)-'A'+1;
            res = res*26+val;
        }
        return res;
    }
}