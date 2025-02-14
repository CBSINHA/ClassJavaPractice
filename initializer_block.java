class Bike{
    int speed=0;
    Bike(){
        speed+=10;
        System.out.println("Constructor is invoked.\nSpeed= "+speed);
    }
    {
        System.out.println("Initializer block is executed.");
    }
}
public class initializer_block {
    public static void main(String[] args) {
        Bike b1=new Bike();
        Bike b2=new Bike();
    }
}
