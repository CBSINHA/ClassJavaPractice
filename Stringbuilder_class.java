public class Stringbuilder_class {
    public static void main(String[] ar){
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb.length());
        System.out.println(sb.reverse());
        int a=123;
        sb.append(a);
        System.out.println(sb.toString());
    }
}
