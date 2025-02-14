class Test{
    int a,b;
    Test(){
        a=10;
        b=100;
    }
    void display(Test object){
        System.out.printf("a= %d and b= %d",object.a,object.b);
    }
    void get(){display(this);}
}
class this_parameter{
    public static void main(String[] args) {
    Test obj=new Test();
    obj.get();}
}