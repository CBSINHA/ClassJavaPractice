public class NonStatic2 {
    int var=200;
    class Inner{
        void print(){
            System.out.println("Non static variable: "+var);
        }
    }
    public static void main(String[] args) {
        NonStatic2 obj=new NonStatic2();
        NonStatic2.Inner obj1=obj.new Inner();
        obj1.print();
    }
}
