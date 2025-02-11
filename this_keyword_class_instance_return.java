class Test{
    int a;
    int b;
    Test(){
        a=10;
        b=20;
    }
    Test get(){return this;}
    void display(){
        System.out.println("a="+a+" b="+b);
    }
}
public class this_keyword_class_instance_return {
    public static void main(String[] args) {
        Test test=new Test();
        test.get().display();
    }
}
