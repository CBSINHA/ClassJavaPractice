class Test{
    void display(){
        this.show();
        System.out.println("Inside display function using this.show()");
    }
    void show(){
        System.out.println("Inside show function");
    }
}
public class this_invoke_class {
    public static void main(String[] args) {
        Test t1=new Test();
        t1.display();
    }
}
