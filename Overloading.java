public class Overloading {

    public static void main(String[] args) {
        add(90);
        add(34,78);
        add(8.4,7.5);
        add("Shilpa","Sinha");
    }
    public static void add(int a, int b){
        int c = a+b;
        System.out.println("Add : "+c);
    }
    public static void add(double a, double b){
        double c = a+b;
        System.out.println("Add : "+c);
    }
    public static void add(String a, String b){
        String c = a+b;
        System.out.println("Add : "+c);
    }
    public static void add(int a){
        int c = a+8;
        System.out.println("Add : "+c);
    }
}
