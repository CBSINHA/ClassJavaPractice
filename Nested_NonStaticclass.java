public class Nested_NonStaticclass {
    class Innerclass{
        void display(){
            System.out.println("Inside the non staic inner class");
        }
    }
    public static void main(String[] args) {
        Nested_NonStaticclass obj=new Nested_NonStaticclass();
        Nested_NonStaticclass.Innerclass innerobj=obj.new Innerclass();
        innerobj.display();

    }
}
