class Number_Of_Senior_Citizens {
    public static void main(String args[]){
        String details[] = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(details));
    }
    public static int countSeniors(String[] details) {
        int count = 0;
        for(String s : details){
            int num = Integer.parseInt(s.substring(11,13));
            if(num>60)
                count++;
        }
        return count;
    }
}