public class Overloading {
    static int add(int a){ return a+10;}
    static double add (double a){return a+2.5;}
    public static void main(String[] args) {
        System.out.println(add(10));
        System.out.println(add(2.5));
    }
}
