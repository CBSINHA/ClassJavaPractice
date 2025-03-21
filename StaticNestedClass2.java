//a static nested class can access only the static members and method outside the nested class while 
//a non static nested class can access all the methods and members outside of itself
public class StaticNestedClass2 {
    static int staticvar=20;
    static class StaticNested{
        void print(){
            System.out.println("Static variable "+staticvar);
        }
    }
    public static void main(String[] args) {
        StaticNested obj=new StaticNested();
        obj.print();
    }
}
