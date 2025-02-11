class Test{
    int a,b;
    Test(){
        this(10,20);
        System.out.println("Inside default constructor");
    }
    Test(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println(a+b);
        System.out.println("Inside parameterized constructor called by the this function inside the default constructor");
    }
}
public class this_function {
    public static void main(String[] args) {
    Test obj=new Test();
    }
}
