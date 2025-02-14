public class Stringbuilder_class {
    public static void main(String[] ar){
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb.length());
        System.out.println(sb.reverse());
        sb.reverse();
        int a=123;
        sb.append(a);
        System.out.println(sb.insert(5,"XD"));
        sb.replace(5,7,"Bleh:P");
        sb.delete(1,5);
        System.out.println(sb.toString());
    }
}
