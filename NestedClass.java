class NestedClass{
    static class Innerclass{
        void display(){System.out.println("Inside Static Nested Class");}
    }
public static void main(String[]args){
    Innerclass ic=new Innerclass();
    ic.display();
}
}