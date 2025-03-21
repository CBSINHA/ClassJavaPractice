public class NonStatic2 {
    int var=200;
    static int var1=20;
    class Inner{
        void print(){
            System.out.println("Non static variable: "+var+"\nNon static variable: "+var1);
        }
    }
    public static void main(String[] args) {
        NonStatic2 obj=new NonStatic2();
        NonStatic2.Inner obj1=obj.new Inner();
        obj1.print();
    }
}
